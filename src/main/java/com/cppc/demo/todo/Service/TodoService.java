package com.cppc.demo.todo.Service;

import com.cppc.demo.todo.Mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TodoService {

    private TodoMapper todoMapper;

    @Autowired
    TodoService(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    //getTodoList - todo조회
    public List<Map<String,Object>> getTodoList(){
        return todoMapper.getTodoList();
    }

    //getTodoDetail - todo상세조회
    public List<Map<String, Object>> getTodoDetail(HashMap map) {
        return todoMapper.getTodoDetail(map);
    }

    //insertTodo - todo등록
    public void insertTodo(HashMap map) { todoMapper.insertTodo(map); }

    //deleteTodo - todo삭제
    public void deleteTodo(HashMap map) { todoMapper.deleteTodo(map); }
}
