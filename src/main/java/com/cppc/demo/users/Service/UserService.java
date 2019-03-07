package com.cppc.demo.users.Service;

import com.cppc.demo.users.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {

    private UserMapper userMapper;

    @Autowired
    UserService(UserMapper userMapper) { this.userMapper = userMapper; }

    //insertUser - 사용자 등록(회원가입)
    public void insertUser(HashMap map) { userMapper.insertUser(map); }

}
