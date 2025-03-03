package com.sujit.kafkademo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

   // @KafkaListener(topics = "sample", groupId = "Group1")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from sample Topic:: %s", msg));
    }
}
