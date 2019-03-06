package com.cppc.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TodoMapper {

    //getTodoList - todo리스트
    List<Map<String,Object>> getTodoList();

    //insertTodo - todo등록
    void insertTodo(HashMap map);

    //deleteTodo - todo삭제
    void deleteTodo(HashMap map);
}
