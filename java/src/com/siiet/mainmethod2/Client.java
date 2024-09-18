package com.siiet.mainmethod2;

import com.siiet.Application2.MMBankFactory;
import com.siiet.Application2.MMCurrentAcc;

import com.siiet.Application2.MMSavingAcc;

public class Client {
	public static void main(String[] args) {
		MMBankFactory obj=new MMBankFactory();
		//savingaccount creation
		MMSavingAcc sa=(MMSavingAcc)obj.getNewSavingAccount(1, "Deepthi", 200, true);
		sa.withdraw(sa.getAccbal());
		//currentaccount creation
		MMCurrentAcc ca=(MMCurrentAcc)obj.getNewCurrentAccount(2, "Keerthi", 400, 200);
		ca.withdraw(ca.getAccbal());
		
		
		
	}

}
