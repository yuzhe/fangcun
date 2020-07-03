package net.ssln.fangcun.collection.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.ssln.fangcun.collection.domain.Task;
import net.ssln.fangcun.collection.service.TaskService;

@Controller
@RequestMapping(value="/task")  
public class TaskController {
	@Resource
	private TaskService taskService;
	@RequestMapping(value="/index")  
    @ResponseBody  
    String test() throws ParseException{  
	   Task t=new Task();
	   t.setId("asdasdasd");
	   taskService.add(t);
		return "aaa";
    }  
	@RequestMapping(value="/addtask")  
    @ResponseBody  
    String addTask(String urls) throws ParseException{  
	   Task t=new Task();
	   t.setId("asdasdasd");
	   taskService.add(t);
	   return "aaa";
    }  
}
