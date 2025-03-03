package com.sujit.kafkademo.consumer;

import com.sujit.kafkademo.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaJsonConsumer {

    @KafkaListener(topics = "sample", groupId = "Group1")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from sample Topic:: %s", student.toString()));
    }
}