package com.siiet.Framework2;

public  abstract class CurrentAcc extends BankAcc {
	private float creditlimit;
	public void withdraw(float accbal) {

}
	public CurrentAcc(int accno, String accnm, float accbal, float creditlimit) {
		super(accno, accnm, accbal);
		this.creditlimit = creditlimit;
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditlimit=" + creditlimit + ", getAccno()=" + getAccno() + ", getAccnm()=" + getAccnm()
				+ ", getAccbal()=" + getAccbal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	public float getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(float creditlimit) {
		this.creditlimit = creditlimit;
	}
	
	
		
}
	
