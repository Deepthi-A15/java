package com.siiet.Application2;

import com.siiet.Framework2.BankFactory;
import com.siiet.Framework2.CurrentAcc;
import com.siiet.Framework2.SavingAcc;


public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accno, String accnm, float accbal, boolean issalary) {
		SavingAcc savingacc=new MMSavingAcc(accno,accnm,accbal,issalary);
		return savingacc;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accnm, float accbal, float creditlimit) {
		CurrentAcc currentacc=new MMCurrentAcc(accno,accnm,accbal,creditlimit);
		return currentacc;
	}
}

	



	
	

	
	
	
