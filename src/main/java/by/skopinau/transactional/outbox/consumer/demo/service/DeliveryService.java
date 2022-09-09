package by.skopinau.transactional.outbox.consumer.demo.service;

import by.skopinau.transactional.outbox.consumer.demo.model.KafkaMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeliveryService {

    @KafkaListener(topics = "orders_server.public.outbox")
    public void receive(KafkaMessage message) {
        log.info(message.toString());
    }
}
