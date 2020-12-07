package com.omar.java.trainig.jcf.lifo;

public abstract class TesterClass {

	public static void main(String[] args) {
		NameStack s = new NameStack();
		
		//s.isEmpty();s.size();
		s.push("omar");
		s.push("bilel");
		s.push("ilyes");
		s.push("brahim");
		s.push("rahim");
		System.out.println(s);
		
		try {
		while(true) {
		s.pop();
		System.out.println(s);
		}
		} catch (NameStackException e) {
			System.out.println(e.getMessage());
		}
	}

}
