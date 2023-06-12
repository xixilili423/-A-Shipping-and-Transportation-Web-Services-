package com.controller;
import com.annotation.UserLoginToken;
import com.entity.Shipment;
import com.entity.ShipperAccount;
import com.service.UserService;
import com.vo.R;
import com.vo.param.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * FileName:  UserController
 * Date: 2023/04/01
 */

@RestController
@RequestMapping("/user")
//@CrossOrigin
@AllArgsConstructor
public class UserController {
    @Autowired
    private final UserService userService;

    // 登陆--post保存

    @PostMapping("login")
    @UserLoginToken
    public R login(@RequestBody LoginParam loginParam) {
        return userService.login(loginParam);
    }

    // 注册--post保存
    @PostMapping("register")
    @UserLoginToken
    public R register(@RequestBody RegisterParam registerParam) {
        return userService.register(registerParam);
    }

    @PostMapping("tracking")
    @UserLoginToken
    public R  tracking(@RequestBody String itemid,@RequestAttribute("id") String id){
        return userService.tracking(itemid);
   }

    @PostMapping("createOrder")
    @UserLoginToken
    public R createOrder(@RequestBody CreateOrderParam createOrderParam,@RequestAttribute("id")String id)
    {
       return  userService.createOrder(createOrderParam,id);
    }
}
