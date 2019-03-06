package com.cppc.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TodoMapper {
    List<Map<String,Object>> getTodo();

    void insertTodo(HashMap map);

    void deleteTodo(HashMap map);
}
