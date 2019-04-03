package com.cppc.demo.users.Service;

import com.cppc.demo.users.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private UserMapper userMapper;

    @Autowired
    UserService(UserMapper userMapper) { this.userMapper = userMapper; }

    //getUserList - 사용자 조회
    public List<Map<String, Object>> getUserList(){ return userMapper.getUserList(); }

    //getUserDetail - 사용자 상세조회
    public List<Map<String, Object>> getUserDetail(HashMap map){ return userMapper.getUserDetail(map); }

    //insertUser - 사용자 등록(회원가입)
    public void insertUser(HashMap map) { userMapper.insertUser(map); }

    //duplicateCheckId - 사용자 아이디 중복체크
    public int duplicateCheckId(String userId) { return userMapper.duplicateCheckId(userId); }

    //updateUser - 사용자 수정
    public void updateUser(HashMap map) { userMapper.updateUser(map); }

}
