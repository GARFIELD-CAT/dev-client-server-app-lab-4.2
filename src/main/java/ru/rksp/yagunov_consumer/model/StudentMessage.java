package ru.rksp.yagunov_consumer.model;

import lombok.Data;

import java.time.Instant;

@Data
public class StudentMessage {
    private String fullName;
    private String passport;
    private Instant createdAt;
}
