package com.cppc.demo.Service;

import com.cppc.demo.Mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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


    public List<Map<String, Object>> getTodo() {
        return todoMapper.getTodo();
    }

    public void insertTodo(HashMap map) { todoMapper.insertTodo(map); }

    public void deleteTodo(HashMap map) { todoMapper.deleteTodo(map); }
}
