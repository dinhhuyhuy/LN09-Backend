package com.example.LN09_Backend.repository;

import com.example.LN09_Backend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Short> {
}

