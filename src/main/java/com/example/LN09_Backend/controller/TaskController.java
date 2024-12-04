package com.example.LN09_Backend.controller;

import com.example.LN09_Backend.entity.Task;
import com.example.LN09_Backend.repository.TaskRepository;
import com.example.LN09_Backend.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public List<Task> getTask() {
        return taskService.findAll();
    }

    @PutMapping("/{taskId}/status")
    public ResponseEntity updateTaskStatus(
            @PathVariable String taskId,
            @RequestBody String status) {
        // Fetch the task by ID (you'll replace this with your service logic)
//        System.out.println("taskId = " + taskId);
//        System.out.println("status = " + status);

        // {"status":"DONE"} => DONE
        status = status.substring(11, status.length() - 2);

        if(status.equals("TODO"))
            status = "TO-DO";

//        System.out.println("status = " + status);
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
