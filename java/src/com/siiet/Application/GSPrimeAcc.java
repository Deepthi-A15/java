package com.siiet.Application;

import com.siiet.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accno, String accnm, float charges, boolean isprime) {
		super(accno, accnm, charges, isprime);
		
	}
	public void bookproduct(float charges) {
		System.out.println("Dear prime user,your producut charges are:"+getCharges());
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [isprime()=" + isprime() + ", toString()=" + super.toString() + ", getAccno()=" + getAccno()
				+ ", getAccnm()=" + getAccnm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
	
	
	
	
	
	
	


