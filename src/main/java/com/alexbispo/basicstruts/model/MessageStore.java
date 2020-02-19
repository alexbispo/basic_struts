package com.alexbispo.basicstruts.model;

public class MessageStore {

	public String getMessage() {
		return "Struts é fiche!";
	}
	
	@Override
	public String toString() {
		return getMessage() + " (from toString)";
	}
}
