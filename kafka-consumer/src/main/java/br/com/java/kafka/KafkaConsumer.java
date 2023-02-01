package br.com.java.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "${topic.name}")
	public void receive(@Payload SimpleMessage consumerMessage, @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
			@Header(KafkaHeaders.OFFSET) int offset) {
		log.info("Received message [{}] from partition-{} with offset-{}", consumerMessage.getBody(), partition,
				offset);
	}
}
