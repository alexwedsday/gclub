package br.com.blueteam.gclub.model;

import java.sql.Timestamp;
import java.time.Instant;

public class Error<T> {
	
	private Timestamp timestamp;
	
	private String status;
	
	private String message;
	
	public Error() {
		this.timestamp  = Timestamp.from(Instant.now());
		
	}

	public Error(String status, String message) {
		
		this.timestamp = Timestamp.from(Instant.now());
		this.status = status;
		this.message = message;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

	
}
