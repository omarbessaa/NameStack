package com.omar.java.trainig.jcf.lifo;

import java.util.LinkedList;
import java.util.List;

public class NameStack {

	private List<String> stack;
	
	public NameStack() {
		this.stack = new LinkedList<>();
	}

	/**
	 * add the given name to the top of the stack
	 * @param the new name to be added
	 */
	public void push(String name) {
		this.stack.add(0, name);
	}
	
	/**
	 * remove and return the name at the top of the stack
	 * @return the name at the top of the stack
	 * @throws NameStackException if the stack is empty
	 */
	public String pop() throws NameStackException {
		if ( this.isEmpty() ) throw new NameStackException();
		return this.stack.remove(0);
	}
	
	/**
	 * check if the stack is empty
	 * @return true if the stack is empty, false if not
	 */
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}
	
	/**
	 * 
	 * @return the number of names in the stack
	 */
	public int size() {
		return this.stack.size();
	}
	
	@Override
	public String toString() {
		return this.stack.toString();
	}
	
}
