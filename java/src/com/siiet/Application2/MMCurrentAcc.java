 package com.siiet.Application2;

import com.siiet.Framework2.CurrentAcc;
public class MMCurrentAcc extends CurrentAcc{


	public MMCurrentAcc(int accno, String accnm, float accbal, float creditlimit) {
		super(accno, accnm, accbal, creditlimit);
		
	}
	public void withdraw(float accbal) {
		System.out.println("Dear currentAccount user,your credit limit is:"+getAccbal()+"creditlimit"+getCreditlimit());
	}
	
	
	

}





