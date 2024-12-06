package com.example.LN09_Backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tasks", schema = "sakila")
public class Task {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "title", nullable = false)
    private String title;

    @Lob
    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "priority", nullable = false)
    private String priority;

    @Column(name = "duedate", nullable = false)
    private LocalDate duedate;

    @Column(name = "status", nullable = false)
    private String status;
}
