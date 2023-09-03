package com.project.kafka.kafka;

import com.project.kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "topicJson",groupId = "myGroup")
    public void consume(User user){
        LOGGER.info("Json message received"+user.toString());
    }



}
