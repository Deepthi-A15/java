package com.siiet.Framework2;

public abstract class SavingAcc extends BankAcc {
	private boolean issalary;
	private static final float creditlimit=0;
	 
	public boolean issalary() {
		return issalary;
		
	}

	public void setIssalary(boolean issalary) {
		this.issalary = issalary;
	}

	public static float getCreditlimit() {
		return creditlimit;
	}

	@Override
	public String toString() {
		return "SavingAcc [issalary=" + issalary + "]";
	}

	public SavingAcc(int accno, String accnm, float accbal, boolean issalary) {
		super(accno, accnm, accbal);
		this.issalary = issalary;
	}

	public void withdraw(float accbal) {
		
	}
	
	
	
	

	
	
	

}
