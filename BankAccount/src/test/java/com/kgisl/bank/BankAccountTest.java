package com.kgisl.bank;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BankAccountTest {
	BankAccount bankAccount;
	BankAccountVO bankAccountVO;

	@Test
	public void bankdeposite() {
		bankAccountVO.setAccStatus(true);
		bankAccountVO = bankAccount.depositAmount(bankAccountVO, 1000);
		assertEquals(1000, bankAccountVO.getAccBalance());
		bankAccountVO = bankAccount.withdrawAmount(bankAccountVO, 100);
		assertEquals(900, bankAccountVO.getAccBalance());
	}

	@Test
	public void negativeTest() {
		bankAccountVO.setAccStatus(true);
		bankAccountVO = bankAccount.depositAmount(bankAccountVO, -1000);
		bankAccountVO = bankAccount.withdrawAmount(bankAccountVO, 100);
		System.out.println("End of Negative test case");
	}

	@BeforeTest
	public void beforeTest() {
		bankAccount = new BankAccount();
		bankAccountVO = new BankAccountVO("KGISL");
	}

	@AfterTest
	public void afterTest() {
		System.out.println(
				"---------------------------------------------\nAccount Details\n---------------------------------------------");
		System.out.println("Account holder's name: " + bankAccountVO.getAccHoldersName() + "\nAccount No: "
				+ bankAccountVO.getAccNumber() + "\nBalance: " + bankAccountVO.getAccBalance());
		System.out.println(
				"---------------------------------------------\nTransaction Details\n---------------------------------------------");

		if (bankAccountVO.getTransactions() != null)
			bankAccountVO.getTransactions().forEach(System.out::println);
		else
			System.out.println("There is no transaction");
	}

}
