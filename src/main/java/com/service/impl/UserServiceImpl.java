package com.service.impl;
import com.auth0.jwt.algorithms.Algorithm;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.entity.*;
import com.mapper.*;
import com.pojo.*;
import com.pojo.Address;
import com.pojo.Billing;
import com.pojo.Shipment;
import com.vo.R;
import com.vo.param.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.auth0.jwt.JWT;
import com.service.*;
import java.util.Date;
import java.util.List;


/**
 * FileName:  UserServiceImpl
 * Date: 2023/04/13
 */
@Service
@AllArgsConstructor
public  class UserServiceImpl implements UserService {
    @Autowired
    private final ShipperAccountMapper userMapper;
    @Autowired
    private  final AddressMapper addressMapper;
    @Autowired
    private final ShipmentMapper shipmentMapper;
    @Autowired
    private  final BillingMapper billingMapper;

    // 登录
    @Override
    public R login(LoginParam loginParam){
        QueryWrapper<Shipperaccount> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",loginParam.getUsername()).eq("password",loginParam.getPassword());
        R r= new R();
        List<Shipperaccount> shipper = userMapper.selectList(queryWrapper);//
        if(shipper!=null) {
            String token = getToken(loginParam);
            r.data("token", token);
            r.data("status_code", true);
            return  r;
        }
        else
        {
                r.data("status_code",false);
                r.data("token","");
                return r;
        }
    }
    // 注册
    @Override
    public R register(ShipperAccount registerParam) {
        R r= new R();
        Address address=new Address();
        QueryWrapper<Shipperaccount> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",registerParam.getId());
        boolean u = userMapper.exists(queryWrapper);
        System.out.println(u);
        if(!u)
        {
            Date now = new Date();
            Shipperaccount shipperAccount=new Shipperaccount();
            shipperAccount.setPassword(registerParam.getPassword());
            int insert = addressMapper.insert(registerParam.getAddress());
            shipperAccount.setPassword(registerParam.getPassword());
           shipperAccount.setType(registerParam.getType());
           shipperAccount.setDescription(registerParam.getDescription());
           shipperAccount.setContactName(registerParam.getAddress().getContactName());
           shipperAccount.setSettings(registerParam.getSettings());
           shipperAccount.setSlug(registerParam.getSlug());
           shipperAccount.setId(registerParam.getId());
           shipperAccount.setTimezone(registerParam.getTimezone());
           shipperAccount.setCreatedAt(now.toString());
           shipperAccount.setUpdatedAt(now.toString());
           userMapper.insert(shipperAccount);
            r.data("status_code",insert);
            return r;
        }
        else {
            r.data("status_code",false);
            return r;
        }
    }

    @Override
    public R Billing(com.entity.Billing billing) {
        return null;
    }
    //修改密码


    @Override
    public R tracking(String itemid) {
        R r= new R();
        r.data("status_code",false);
        QueryWrapper<Shipment> queryWrapper = new QueryWrapper<>();
        QueryWrapper<com.pojo.Address> queryWrapper1 = new QueryWrapper<>();
        queryWrapper.eq("parcels",itemid);
        Shipment shipment= shipmentMapper.selectOne(queryWrapper);
        if(shipment!=null) {
            queryWrapper1.eq("id", shipment.getReturnTo());
            com.pojo.Address address = addressMapper.selectOne(queryWrapper1);
            if (address != null) {
                r.data("address", address);
                return r;
            }
        }
       r.setMessage("记录不存在");
       return r;
    }

    public String getToken(LoginParam user) {
        String token="";
        token= JWT.create().withAudience(user.getUsername())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
    // 主页请求用户信息
    public Shipperaccount findUserById(String id)
    {
        Shipperaccount shipperaccount;
        QueryWrapper<Shipperaccount> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        shipperaccount= userMapper.selectOne(queryWrapper);
        return shipperaccount;

    }
    @Override
    public R createOrder( com.pojo.Shipment shipment, String id) {
        R r = new R();
        Billing billing=new Billing();
        QueryWrapper<com.pojo.Address> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",shipment.getShipFrom());
       Shipment shipment1=new com.pojo.Shipment();
       shipment1.setParcels(shipment.getParcels());
       shipment1.setReturnTo(shipment.getReturnTo());
       shipment1.setShipFrom(shipment.getShipFrom());
       shipment1.setShipTo(shipment.getShipTo());
       shipment1.setType(shipment.getType());
       com.pojo.Address addressfrom=addressMapper.selectOne(queryWrapper);
       if(addressfrom!=null) {
              billing.setCountry(addressfrom.getCountry());
          }
              billing.setAccountNumber(id);
              billing.setPaidBy(id);

       shipment1.setDeliveryInstructions(shipment.getDeliveryInstructions());
       int i=shipmentMapper.insert(shipment1);
          billingMapper.insert(billing);
       r.data("status_code",i);
        return r;
    }

    //修改个人信息


}
