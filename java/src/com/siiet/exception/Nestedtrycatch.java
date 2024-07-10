package com.siiet.exception;

public class Nestedtrycatch {
	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("String length"+slength);
		String anotherstring=null;
		int y=6;
		try{
			try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("indexout of bound exception"+ex.getMessage());
		}
		System.out.println("string length"+anotherstring.length());
	}
	catch(NullPointerException npe) {
		System.out.println("indexout of bound exception"+npe.getMessage());
	}
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	


