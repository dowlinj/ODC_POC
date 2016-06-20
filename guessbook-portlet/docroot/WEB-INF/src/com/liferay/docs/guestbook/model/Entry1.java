package com.liferay.docs.guestbook.model;

public class Entry1 {

	private String name;
	private String message;
	
	
	public Entry1() {

        this.name = null;
        this.message = null;

    }

    public Entry1 (String name, String message) {

        setName(name);
        setMessage(message);

    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
