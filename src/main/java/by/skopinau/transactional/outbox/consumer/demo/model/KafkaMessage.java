package by.skopinau.transactional.outbox.consumer.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class KafkaMessage {

    private PayLoad payload;
}
