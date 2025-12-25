package ru.rksp.yagunov_consumer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import ru.rksp.yagunov_consumer.model.StudentMessage;
import ru.rksp.yagunov_consumer.model.StudentMessageEntity;
import ru.rksp.yagunov_consumer.repository.StudentMessageRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentMessageListener {

    private final StudentMessageRepository repository;

    @RabbitListener(queues = "${app.rabbitmq.queue}")
    public void handleStudentMessage(StudentMessage message) {
        log.info("------------Сообщение успешно получено------------");
        StudentMessageEntity entity = new StudentMessageEntity();
        entity.setFullName(message.getFullName());
        entity.setPassport(message.getPassport());
        entity.setCreatedAt(message.getCreatedAt());

        repository.save(entity);
        log.info("------------Сообщение успешно обработано------------");
    }
}

