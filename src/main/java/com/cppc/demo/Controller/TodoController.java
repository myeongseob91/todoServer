package com.cppc.demo.Controller;

import com.cppc.demo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("/todo/{todoId}")
    @ResponseBody
    public List<Map<String, Object>> getEmployee(@PathVariable("todoId") String todoId) {
        //System.out.println("todoId:::::::::::::::::::::::::"+todoId);
        return todoService.getTodo();
    }

    @PostMapping("/todos")
    @ResponseBody
    public void insertTodo(@RequestParam HashMap<String,Object> params){
        //System.out.println("params::::::::::::::::::::::::"+params);
        todoService.insertTodo(params);
    }

    @DeleteMapping("/todo/{todoId}")
    @ResponseBody
    public void deleteTodo(@PathVariable("todoId") String todoId){
        HashMap<String, Object> map = new HashMap<>();
        map.put("todoId", todoId);
        todoService.deleteTodo(map);
    }


}
//