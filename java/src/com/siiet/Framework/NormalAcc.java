package com.siiet.Framework;

public  abstract class NormalAcc extends ShopAcc{
	
	
	private float deliverycharges;
	public void bookproduct(float charges) {
	}

	public NormalAcc(int accno, String accnm, float charges, float deliverycharges) {
		super(accno, accnm, charges);
		this.deliverycharges= deliverycharges;
	}

	@Override
	public String toString() {
		return "NormalAcc [deliverycharges=" + deliverycharges + "]";
	}
	public float getdeliverycharges() {
		return deliverycharges;
	}
	public void setdeliverycharges(float deliverycharges) {
		this.deliverycharges=deliverycharges;
		
	}
		

	
	
	

}
