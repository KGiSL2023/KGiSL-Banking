package com.kgisl.bank;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FixedDepositTest {

	private String acct_holder_name;

	@BeforeTest
	public void setUp() throws Exception {
		acct_holder_name = "AAAAA";
	}

	@Test
	public void test() {

		FixedDepositAccount fd1 = new FixedDepositAccount(acct_holder_name, 500);
		assertEquals(515, fd1.getBalance());
		System.out.println("---------------------------------------------\nFD Account Details - Default interest 3%\n---------------------------------------------");
		System.out.println("Account holder's name: " + acct_holder_name + "\nAccount No: "
				+ fd1.getAcctHolder().getAccNumber() + "\nBalance: " + fd1.getBalance());

		FixedDepositAccount fd2 = new FixedDepositAccount(acct_holder_name, 1000, 10);
		assertEquals(1100, fd2.getBalance());
		System.out.println("---------------------------------------------\nFD Account Details - Updtated interest 10%\n---------------------------------------------");
		System.out.println("Account holder's name: " + acct_holder_name + "\nAccount No: "
				+ fd2.getAcctHolder().getAccNumber() + "\nBalance: " + fd2.getBalance());

	}
}
