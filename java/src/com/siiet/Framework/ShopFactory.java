package com.siiet.Framework;

public interface ShopFactory {
	public PrimeAcc getNewPrimeAcc(int accno,String accnm,float charges,boolean isprime);
	public NormalAcc getNewNormalAcc(int accno,String accnm,float charges,float deliverycharges);

}
