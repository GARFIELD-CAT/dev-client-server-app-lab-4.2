package ru.rksp.yagunov_consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rksp.yagunov_consumer.model.StudentMessageEntity;

public interface StudentMessageRepository extends JpaRepository<StudentMessageEntity, Integer> {
}
