package com.cosmere.digitalWallet.dao;

import com.cosmere.digitalWallet.dto.WalletDTO;

public interface WalletDAO {

	   String createWallet(WalletDTO dto);
	
	   float getcurrentBalance(String name);
	   
	   float addMoney(float credit,String name);
	   
	   float pay(float debit,String name);
	   
	   byte getRemainingTransaction(String name);
	   
	   byte getTotalTodaysTransaction();
	   
	   double totalAmountTransaction();
	   
	   void printAll();
	
}
