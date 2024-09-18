package com.siiet.Framework;

public abstract class PrimeAcc  extends ShopAcc{
	private boolean isprime;
	private static final float deliverycharge=0;
	
	
	public boolean isprime() {
		return isprime;
	}


	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}


	public static float getDeliverycharge() {
		return deliverycharge;
	}


	@Override
	public String toString() {
		return "PrimeAcc [isprime=" + isprime + "]";
	}


	public PrimeAcc(int accno, String accnm, float charges, boolean isprime) {
		super(accno, accnm, charges);
		this.isprime = isprime;
	}
	public void bookproduct(float charges) {
	
	}
}
	


