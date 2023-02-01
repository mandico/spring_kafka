package br.com.java.kafka.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.java.kafka.KafkaProducer;
import br.com.java.kafka.SimpleMessage;

@RestController
@RequestMapping("/api")
public class KafkaSender {

	private final KafkaProducer kafkaProducer;

	public KafkaSender(KafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}

	@PostMapping("send")
	public String sendData(@RequestBody SimpleMessage message) {
		this.kafkaProducer.send(message);
		return "Send Success | Message: " + message.getBody() + "\n";
	}
}