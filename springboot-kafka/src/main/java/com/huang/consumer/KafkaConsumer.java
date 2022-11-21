package com.huang.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Time 2022-11-14 11:18
 * Created by Huang
 * className: KafkaConsumer
 * Description:
 */
@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "topic1")
    public void consumer1(ConsumerRecord<?, ?> record){
        log.info("topic: {}",record.topic());
        log.info("value: {}",record.value().toString());
        log.info("record: {}", record);
        log.info("headers: {}",record.headers().toString());
        log.info("leaderEpoch: {}",record.leaderEpoch().toString());
        log.info("offset: {}", record.offset());
        log.info("partition: {}", record.partition());
        log.info("timestamp: {}", record.timestamp());
    }

}
