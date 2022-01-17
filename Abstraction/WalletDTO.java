package com.cosmere.digitalWallet.dto;
import java.util.Objects;

public class WalletDTO {
	private String name;
	private byte noOfTransaction;
	private int maxLimit;
	private float availableBalance;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setNoOfTransaction(byte noOfTransaction) {
		this.noOfTransaction = noOfTransaction;
	}
	public byte getNoOfTransaction() {
		return noOfTransaction;
	}
   public void setMaxLimit(int maxLimit) {
	this.maxLimit = maxLimit;
}
   public int getMaxLimit() {
	return maxLimit;
}
   public void setAvailableBalance(float availableBalance) {
	this.availableBalance = availableBalance;
}
   public float getAvailableBalance() {
	return availableBalance;
}
   @Override
public String toString() {
	return this.getClass().getSimpleName()+ " Name of the digitalWallet"+ name+
			" \t No of transitions " +noOfTransaction+
			" \t Max Limit "+maxLimit+ " \t Available Balance "+availableBalance;
}
   @Override
public int hashCode() {
	return Objects.hash(name, noOfTransaction, maxLimit, availableBalance);
}
   @Override
public boolean equals(Object obj) {
	if(obj==null) {
		return false;
		
	}else {
		if(obj instanceof WalletDTO) {
			WalletDTO dto = (WalletDTO)obj;
			if(dto.getName().equals(this.name) && dto.getNoOfTransaction()==this.availableBalance && dto.getMaxLimit()==this.maxLimit && dto.getAvailableBalance()==this.availableBalance) {
			 return true;
		}
			return false;
	}
		return false;
	}
   

   }


   }

