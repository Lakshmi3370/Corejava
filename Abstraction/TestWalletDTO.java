package com.cosmere.digitalWallet;

import com.cosmere.digitalWallet.dao.WalletDAOImpli;
import com.cosmere.digitalWallet.dto.WalletDTO;

public class TestWalletDTO {
	
	public static void main(String[] args) {
		
		WalletDTO walletdto = new WalletDTO ();
		walletdto.setName("G-pay");
		walletdto.setNoOfTransaction((byte)12);
		walletdto.setMaxLimit(40000);
		walletdto.setAvailableBalance(50000.500f);
		
		WalletDTO walletdto1 = new WalletDTO ();
		walletdto1.setName("Phone-Pay");
		walletdto1.setNoOfTransaction((byte)10);
		walletdto1.setMaxLimit(30000);
		walletdto1.setAvailableBalance(60000.56f);
		
		WalletDTO walletdto2 = new WalletDTO ();
		walletdto2.setName("payTM");
		walletdto2.setNoOfTransaction((byte)8);
		walletdto2.setMaxLimit(15000);
		walletdto2.setAvailableBalance(25000.64f);
		
		WalletDAOImpli dao = new WalletDAOImpli();
		String res = dao.createWallet(walletdto);
		String res1 =dao.createWallet(walletdto1);
		String res2 = dao.createWallet(walletdto2);

		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		
		dao.printAll();
		
		float resp = dao.getcurrentBalance("Phone-Pay");
		System.out.println(resp);
		dao.printAll();
		
		
		float resp1 = dao.addMoney(10000, "payTM");
		System.out.println(resp1);
		dao.printAll();
		
		float resp2 = dao.pay(10000 ,"G-pay");
		System.out.println(resp2);
		dao.printAll();
		
		float resp3 = dao.getRemainingTransaction("G-pay");
		System.out.println(resp3);
		dao.printAll();
		
		byte resp4 =dao.getTotalTodaysTransaction();
		System.out.println("total today transactions \t"+resp4);
		System.out.println();
		
		double resp5=dao.totalAmountTransaction();
		System.out.println("total amount transaction done today \t"+resp5);
		System.out.println();

	}

}
