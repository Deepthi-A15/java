package com.siiet.finallyblock;

public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(150/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught"+e.getMessage());
		}
		finally {
			System.out.println("finally");
		}
		

	}

}
