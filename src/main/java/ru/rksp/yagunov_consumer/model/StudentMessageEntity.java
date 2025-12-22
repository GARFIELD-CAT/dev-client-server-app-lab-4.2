package ru.rksp.yagunov_consumer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_message", schema = "utmn")
public class StudentMessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 128)
    private String fullName;

    @Column(nullable = false, length = 32)
    private String passport;

    @Column(nullable = false)
    private Instant createdAt;
}
