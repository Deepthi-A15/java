package com.siiet.overriding;

public class Child extends Father{
	void drinking() {
		System.out.println("horlicks");
		
	}
public static void main(String[] args) {
	Child c=new Child();
	c.drinking();
	
}
}
