package by.skopinau.transactional.outbox.consumer.demo.service;

import by.skopinau.transactional.outbox.consumer.demo.model.KafkaMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @KafkaListener(topics = "orders_server.public.outbox")
    public void receive(KafkaMessage message) {


        System.out.println(message);
    }
}
