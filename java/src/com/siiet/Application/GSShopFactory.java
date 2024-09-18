package com.siiet.Application;

import com.siiet.Framework.NormalAcc;
import com.siiet.Framework.PrimeAcc;
import com.siiet.Framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accno, String accnm, float charges, boolean isprime) {
		PrimeAcc primeacc=new GSPrimeAcc(accno,accnm,charges,isprime);
		return primeacc;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accno, String accnm, float charges,float deliverycharges) {
		NormalAcc normalacc=new GSNormalAcc(accno,accnm,charges,deliverycharges);
		return normalacc;
	}
	

}
