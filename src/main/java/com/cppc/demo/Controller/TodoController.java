package com.cppc.demo.Controller;

import com.cppc.demo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("/todo")
    @ResponseBody
    public List<Map<String, Object>> getEmployee() {
        System.out.println(todoService.getTodo());
        return todoService.getTodo();
    }


}
