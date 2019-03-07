package com.cppc.demo.users.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Mapper
@Repository
public interface UserMapper {

    //insertUser - 사용자 등록(회원가입)
    void insertUser(HashMap map);

}
