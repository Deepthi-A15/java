package com.siiet.Framework2;

public interface BankFactory {
	public  SavingAcc getNewSavingAccount(int accno,String accnm,float accbal,boolean issalary);
	public  CurrentAcc getNewCurrentAccount(int accno,String accnm,float accbal,float creditlimit);

}
