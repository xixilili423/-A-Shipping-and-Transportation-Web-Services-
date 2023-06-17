package com.shipping.Controller;

import com.shipping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @PostMapping(value="/login")
    @ResponseBody
    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password) {
    //   User foundUser = userRepository.findByUsernameAndPassword(username, password);
        ModelAndView model = new ModelAndView();
 //       if (foundUser != null) {
            // 将航运详情添加到模型中
            model.addObject("shipment",username);
            model.setViewName("shipment");
            return model;
       // } else {
     //       model.setViewName("index");
      //      return model;
    //    }
    }
}