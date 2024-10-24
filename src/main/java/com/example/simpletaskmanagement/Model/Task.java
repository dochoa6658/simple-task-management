package com.example.simpletaskmanagement.Model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Task {
    public long id;
    public String title;
    public String description;
    public Status status;
    public LocalDate dueDate;
}
