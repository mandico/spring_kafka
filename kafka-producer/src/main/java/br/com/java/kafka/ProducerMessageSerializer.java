package br.com.java.kafka;

import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerMessageSerializer extends JsonSerializer<SimpleMessage> {

}
