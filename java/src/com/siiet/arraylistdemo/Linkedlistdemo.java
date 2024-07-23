package com.siiet.arraylistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList  l=new LinkedList();
		l.add("ra");
		l.add(2);
		l.add("hjgs");
		l.add(8.9);
		System.out.println("After invoking add()"+1);
		l.add(1,"apple");
		l.addFirst("d");

		l.addLast("Deepthi");
		System.out.println(l);

	}

}
