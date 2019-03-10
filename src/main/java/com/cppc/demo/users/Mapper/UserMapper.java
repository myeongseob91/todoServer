package com.cppc.demo.users.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper {

    List<Map<String,Object>> getUserList();

    //insertUser - 사용자 등록(회원가입)
    void insertUser(HashMap map);

}
