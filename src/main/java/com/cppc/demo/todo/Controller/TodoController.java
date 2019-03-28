package com.cppc.demo.todo.Controller;

import com.cppc.demo.todo.Service.TodoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TodoController {

    private static final Logger LOGGER = LogManager.getLogger(TodoController.class);


    @Autowired
    TodoService todoService;

    /*
     * getTodoList - todo조회
     *
     * */
    @GetMapping("/todo")
    @ResponseBody
    public List<Map<String,Object>> getTodoList(){
        LOGGER.debug("todo list:::::::::::::::::::::::::::::::::::");
        //return null;
        return todoService.getTodoList();
    }

    /*
    * getTodoDetail - todo상세조회
    *
    * */
    @GetMapping("/todo/{todoId}")
    @ResponseBody
    public List<Map<String, Object>> getTodoDetail(@PathVariable("todoId") String todoId) {
        //System.out.println("todoId:::::::::::::::::::::::::"+todoId);
        HashMap<String, Object> map = new HashMap<>();
        map.put("todoId", todoId);
        return todoService.getTodoDetail(map);
    }

    /*
     * insertTodo - todo등록
     *
     * */
    @PostMapping("/todos")
    @ResponseBody
    public void insertTodo(@RequestParam HashMap<String,Object> params){
        //System.out.println("params::::::::::::::::::::::::"+params);
        todoService.insertTodo(params);
    }

    /*
     * updateTodo - todo수정
     *
     * */
    @PutMapping("/todo/{todoId}")
    @ResponseBody
    public void updateTodo(@PathVariable("todoId") String todoId, @RequestParam HashMap<String,Object> params){
        params.put("todoId", todoId);
        todoService.updateTodo(params);
    }

    /*
     * deleteTodo - todo삭제
     *
     * */
    @DeleteMapping("/todo/{todoId}")
    @ResponseBody
    public void deleteTodo(@PathVariable("todoId") String todoId){
        HashMap<String, Object> map = new HashMap<>();
        map.put("todoId", todoId);
        todoService.deleteTodo(map);
    }


}
//