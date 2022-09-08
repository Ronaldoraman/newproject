package com.pojo;

public class Pojo_B {

	public static void main(String[] args) {
		Pojo_A a = new Pojo_A();
		
	    String username = a.getUsername();
		System.out.println(username);
		
		a.setUsername("raman");
		String username2 = a.getUsername();
		System.out.println(username2);
		
		a.setUsername("balaji");
		String username3 = a.getUsername();
		System.out.println( username3);
	}
}

