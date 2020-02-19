package com.alexbispo.basicstruts.action;

import com.alexbispo.basicstruts.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MessageStore messageStore;
	
	public MessageStore getMessageStore() {
		return messageStore;
	}
	
	public String execute() {
		messageStore = new MessageStore();
		
		return SUCCESS;
	}

}
