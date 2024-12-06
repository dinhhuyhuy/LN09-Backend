package com.example.LN09_Backend.controller;

import com.example.LN09_Backend.entity.Task;
import com.example.LN09_Backend.repository.TaskRepository;
import com.example.LN09_Backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    private TaskRepository taskRepository;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public List<Task> getTask() {
        return taskService.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        System.out.println(task);
        Task savedTask = taskRepository.save(task);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }

    @PutMapping("/{taskId}/status")
    public ResponseEntity updateTaskStatus(
            @PathVariable String taskId,
            @RequestBody String status) {

        status = status.substring(11, status.length() - 2);

        if(status.equals("TODO"))
            status = "TO-DO";

        Task task = taskService.getTaskById(taskId);
        if (task == null) {
            System.out.println("Task not found");
            return ResponseEntity.notFound().build();
        }

        // Update the task's status
        task.setStatus(status);

        // Save the updated task (replace with your service logic)
        Task updatedTask = taskService.saveTask(task);

        // Return the updated task as the response
        return ResponseEntity.ok(updatedTask);
    }

}
