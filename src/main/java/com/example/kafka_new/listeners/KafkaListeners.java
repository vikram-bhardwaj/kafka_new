package com.example.kafka_new.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners
{
    @KafkaListener(
            topics = "topicFirst",
            groupId = "group 1"
    )
    void listener(String data)
    {
        System.out.println("Listener received:" + data + " :)");
    }

}
