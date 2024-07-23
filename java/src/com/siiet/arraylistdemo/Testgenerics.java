package com.siiet.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgenerics {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Deepthi");
		al.add("Keerthi");

		al.add("Preethi");
		System.out.println("elements " +al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
