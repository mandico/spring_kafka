package br.com.java.kafka;

public class SimpleMessage {
	private String body;

	public SimpleMessage() {
		super();
	}

	public SimpleMessage(String body) {
		super();
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}