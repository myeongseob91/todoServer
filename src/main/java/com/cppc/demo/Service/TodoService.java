package com.cppc.demo.Service;

import com.cppc.demo.Mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
