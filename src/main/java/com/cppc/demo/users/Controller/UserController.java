package com.cppc.demo.users.Controller;

import com.cppc.demo.users.Service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    private static final Logger LOGGER = LogManager.getLogger(UserController.class);

    @Autowired
    UserService userService;

    /*
     * getUserList - 사용자 조회
     *
     * */
    @GetMapping("/user")
    @ResponseBody
    public List<Map<String, Object>> getUserList(){
        return userService.getUserList();
    }

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
