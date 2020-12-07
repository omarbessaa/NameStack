package com.omar.java.trainig.jcf.lifo;

public class NameStackException extends Exception{

	public NameStackException() {
		super("NameStackException : stack is empty");
	}

	public NameStackException(String message) {
		super(message);
	}

}
