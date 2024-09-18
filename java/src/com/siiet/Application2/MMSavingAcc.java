package com.siiet.Application2;

import com.siiet.Framework2.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accno, String accnm, float accbal, boolean issalary) {
		super(accno, accnm, accbal, issalary);
	
	}
	public void withdraw(float accbal) {
		System.out.println("Dear Normal user,your credit limit is:"+getAccbal());
	}
	@Override
	public String toString() {
		return "MMSavingAcc [issalary()=" + issalary() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccnm()=" + getAccnm() + ", getAccbal()=" + getAccbal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
	


