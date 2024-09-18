package com.siiet.mainmethod;

import com.siiet.Application.GSNormalAcc;
import com.siiet.Application.GSPrimeAcc;
import com.siiet.Application.GSShopFactory;

public class client {
public static  void main(String[] args) {
	GSShopFactory obj=new GSShopFactory();
	//prime account creation
	GSPrimeAcc ga=(GSPrimeAcc)obj.getNewPrimeAcc(12, "java", 500.6f,true);
	ga.bookproduct(ga.getCharges());
	//normal account creation
	GSNormalAcc ge=(GSNormalAcc)obj.getNewNormalAcc(13, "spring", 500.6f, 65.4f);
	ge.bookproduct(ge.getCharges());
	
}
}
