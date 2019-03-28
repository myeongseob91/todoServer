package com.cppc.demo.users.Controller;

import com.cppc.demo.users.Service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        //System.out.println("params:::::::::::::::::::"+params);

        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword("toma");

        //System.out.println("기존  password :: " + params.get("password") + " | 변경 password :: " + pbeEnc.encrypt(params.get("password").toString()));
        params.put("password",pbeEnc.encrypt(params.get("password").toString()));
        userService.insertUser(params);
    }

    /*
     * duplicateCheckId - 사용자 아이디 중복체크
     *
     * */
    @PostMapping("/user/duplication/{userId}")
    @ResponseBody
    public boolean duplicateCheckId(@PathVariable("userId") String userId){
        int resultValue = userService.duplicateCheckId(userId); //사용자ID 중복체크

        if(resultValue == 0){ //중복되는 아이디 없을 경우
            return true;
        } else {
            return false;
        }
    }

}
