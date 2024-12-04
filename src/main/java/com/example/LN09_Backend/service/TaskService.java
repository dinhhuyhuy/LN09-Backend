package com.example.LN09_Backend.service;

import com.example.LN09_Backend.entity.Task;
import com.example.LN09_Backend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public Task getTaskById(String taskId) {
        return taskRepository.findById(taskId).orElse(null);
    }
}
