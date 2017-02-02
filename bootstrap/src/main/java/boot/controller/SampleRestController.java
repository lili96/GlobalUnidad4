package boot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import boot.model.Task;
import boot.service.ItemService;
import boot.service.LocationService;
import boot.service.PersonPhysicalService;
import boot.service.TaskService;


@RestController
public class SampleRestController {
	
	@Autowired
	private TaskService taskService;

	@Autowired
	private LocationService locationService;
	@Autowired
	private PersonPhysicalService personPhysicalService;
	@Autowired
	private ItemService itemService;

	
	
	
	@GetMapping("/hello") 
	public String hello(){
		return "Hola Mundo";
	}
	
	/*
	@GetMapping("/all-tasks")
	public String  allTasks(){
		return taskService.findAll().toString(); 
	}
	
	@GetMapping("/save-task")
	public String saveTask(@RequestParam String name, @RequestParam String desc){
		Task task = new Task(name, desc, new Date(), false);
		taskService.save(task);
		return "Task saved!";
	}
	
	@GetMapping("/delete-task")
	public String deleteTask(@RequestParam int id){
		taskService.delete(id);
		return "Task deleted!";
	}*/
}
