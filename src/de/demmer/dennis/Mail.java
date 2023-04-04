package de.demmer.dennis;

public class Mail {
	
	private String sender;
	
	private String text;
	
	private int date;
		
	public Mail(String text) {
		this.text = text;
	}

	
	
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
	
	

}
