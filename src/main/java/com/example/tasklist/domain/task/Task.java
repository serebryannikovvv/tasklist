package com.example.tasklist.domain.task;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
public class Task {

    private long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime expirationDate;
}
