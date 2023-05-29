package com.controller;

import com.annotation.UserLoginToken;
import com.entity.Shipment;
import com.entity.ShipperAccount;
import com.service.UserService;
import com.vo.R;
import com.vo.param.*;
import lombok.AllArgsConstructor;
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

    private final UserService userService;

    // 登陆--post保存

    @PostMapping("login")
    public R login(@RequestBody LoginParam loginParam) {
        return userService.login(loginParam);
    }

    // 注册--post保存
    @PostMapping("register")
    public R register(@RequestBody ShipperAccount shipperAccount) {
        return userService.register(shipperAccount);
    }
    @UserLoginToken
    @PostMapping("tracking")
    public R  tracking(@RequestBody String itemid){
        return userService.tracking(itemid);
   }
    @UserLoginToken
    @PostMapping("createOrder")
    public R createOrder(@RequestBody Shipment shipment,@RequestHeader(name = "id")String id)
    {
       return  userService.createOrder(shipment,id);
    }
}
