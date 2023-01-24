package com.kgisl.bank;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class BankAccountVO {
	

	private String accHoldersName;
	private String accNumber = "5104"+(new Random().nextInt(999999));
	private double accBalance;
	private List<String> transactions;
	private boolean accStatus;
	private Date accCreatingDate;
	private Date accClosingDate;
	
	
	public BankAccountVO(String accHoldersName) {
		super();
		this.accHoldersName = accHoldersName;
		this.accBalance = 0;
	}
	public BankAccountVO(String accHoldersName, double accBalance) {
		super();
		this.accHoldersName = accHoldersName;
		this.accBalance = accBalance;
	}
	
	public String getAccHoldersName() {
		return accHoldersName;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public List<String> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}
	public boolean isAccStatus() {
		return accStatus;
	}
	public void setAccStatus(boolean accStatus) {
		this.accStatus = accStatus;
	}
	public Date getAccCreatingDate() {
		return accCreatingDate;
	}
	public void setAccCreatingDate(Date accCreatingDate) {
		this.accCreatingDate = accCreatingDate;
	}
	public Date getAccClosingDate() {
		return accClosingDate;
	}
	public void setAccClosingDate(Date accClosingDate) {
		this.accClosingDate = accClosingDate;
	}

}
