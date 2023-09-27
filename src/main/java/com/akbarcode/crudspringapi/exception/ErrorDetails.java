/**
 * 
 */
package com.akbarcode.crudspringapi.exception;

import java.util.Date;

/**
 * @author
 *  Akbar Pambudi Utomo Sep 27, 2023 1:16:23 PM
 */
public class ErrorDetails {

	private Date timestamp;
	private String message;
	private String details;
	/**
	 * @param timestamp
	 * @param message
	 * @param details
	 */
	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
}
