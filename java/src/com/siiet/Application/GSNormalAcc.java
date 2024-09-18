package com.siiet.Application;

import com.siiet.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accno, String accnm, float charges, float deliverycharges) {
		super(accno, accnm, charges, deliverycharges);
		
	}
	public void bookproduct(float charges) {
		System.out.println("Dear normal user ,your product charges are"+getCharges()+"deliverycharges"+getdeliverycharges());
		
	}
	

}
