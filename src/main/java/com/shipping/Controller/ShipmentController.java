package com.shipping.Controller;

import com.shipping.entity.Shipment;
import com.shipping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;


@Controller
@RequestMapping("/shipping")
public class ShipmentController {
    @Autowired
    public UserRepository userRepository;

    @PostMapping("/track")
    public ModelAndView trackShipment(@RequestParam String item, ModelAndView model) {
        // 根据 item ID 进行航运查询，获取航运详情
        Shipment shipment = getShipmentDetails("1");
        if (shipment != null) {
            model.addObject("shipment", shipment);
            model.setViewName("shipment");
        }
        model.addObject("shipment", shipment);
        model.setViewName("shipment");//没有设置view名，默认转发到controller的ur导致报错
        // 将航运详情添加到模型中
        // 返回视图名
        return  model;
    }
    
    private Shipment getShipmentDetails(String itemId) {
        // 根据 item ID 查询航运详情的逻辑
        // ...
        // 示例：创建一个 Shipment 对象并返回
        Shipment shipment = new Shipment();
        shipment.setReturnto("123 Main Street, City, Country");
        shipment.setUpdateat(LocalDate.now().toString());

        return shipment;
    }
}