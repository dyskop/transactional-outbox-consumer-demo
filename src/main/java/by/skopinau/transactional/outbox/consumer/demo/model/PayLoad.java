package by.skopinau.transactional.outbox.consumer.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PayLoad {

    int id;

    String event;

    @JsonProperty("event_id")
    int eventId;

    String payload;

    @JsonProperty("created_at")
    String createdAt;

    @Override
    public String toString() {
        return "PayLoad [id=" + id + ", event=" + event + ", eventId=" + eventId + ", payload=" + payload
                + ", createdAt=" + createdAt + "]";
    }
}
