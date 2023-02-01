package br.com.java.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

	private final KafkaTemplate<String, SimpleMessage> kafkaTemplate;

	@Value("${topic.name}")
	private String topicName;

	public KafkaProducer(KafkaTemplate<String, SimpleMessage> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	public void send(SimpleMessage message) {
		this.kafkaTemplate.send(topicName, message);
		log.info("Message [{}] | Topic: [{}]", message.getBody(), topicName);
	}
}