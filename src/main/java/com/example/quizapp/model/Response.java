package com.example.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
public class Response {
    @Id
    private Integer id;
    private String response;

    public String getResponse() {
        return response;
    }
}
