package com.kgisl.bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

	public BankAccountVO depositAmount(BankAccountVO bankAccountVO, double depositeAmount) {
		List<String> transactions;
		LocalDateTime currentDate = null;
		DateTimeFormatter formatter = null;
		String transaction = null;
		try {

			if (!bankAccountVO.isAccStatus())
				throw new IllegalArgumentException("Account is closed!");
			else if (depositeAmount < 0) 
				throw new IllegalArgumentException("Entered amount is invalid!");
			else {
				currentDate = LocalDateTime.now();
				formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

				if (bankAccountVO.getTransactions() != null) {
					transactions = bankAccountVO.getTransactions();
				} else {
					transactions = new ArrayList<String>();
				}

				transaction = "Deposit $" + depositeAmount + " at " + currentDate.format(formatter);
				transactions.add(transaction);
				bankAccountVO.setTransactions(transactions);
				bankAccountVO.setAccBalance(bankAccountVO.getAccBalance() + depositeAmount);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return bankAccountVO;
	}

	public BankAccountVO withdrawAmount(BankAccountVO bankAccountVO, double withrawAmount) {
		List<String> transactions;
		LocalDateTime currentDate = null;
		DateTimeFormatter formatter = null;
		String transaction = null;
		try {
			currentDate = LocalDateTime.now();
			formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

			if (bankAccountVO.getTransactions() != null) 
				transactions = bankAccountVO.getTransactions();
			else
				transactions = new ArrayList<String>();
			
			transaction = "Withdraw $" + withrawAmount + " at " + currentDate.format(formatter);
			transactions.add(transaction);
			bankAccountVO.setTransactions(transactions);

			if (!bankAccountVO.isAccStatus())
				throw new IllegalArgumentException("Account is closed!");
			else if (bankAccountVO.getAccBalance() - withrawAmount < 0) 
				throw new IllegalArgumentException("Insufficiant balance!");
		    else
				bankAccountVO.setAccBalance(bankAccountVO.getAccBalance() - withrawAmount);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return bankAccountVO;
	}
	
}
