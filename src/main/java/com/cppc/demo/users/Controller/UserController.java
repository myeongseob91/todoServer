package com.cppc.demo.users.Controller;

import com.cppc.demo.users.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    /*
    * insertUser - 사용자 등록(회원가입)
    *
    * */
    @PostMapping("/users")
    @ResponseBody
    public void insertUser(@RequestParam HashMap<String,Object> params){
        System.out.println("params:::::::::::::::::::"+params);
        userService.insertUser(params);
    }

}
