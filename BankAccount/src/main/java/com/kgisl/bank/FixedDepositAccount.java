package com.kgisl.bank;

public class FixedDepositAccount{
	
	BankAccountVO acctHolder;
	public BankAccountVO getAcctHolder() {
		return acctHolder;
	}

	private final float acct_balance;
	private float interest = 3.0f;
//	private int duration_mths = 6;
	private boolean isInterestUpdated = false;
//	private boolean isDurationUpdatd = false; 
	
	public FixedDepositAccount(String acct_holder_name, float acct_balance) {
		super();
		acctHolder = new BankAccountVO(acct_holder_name);
		this.acct_balance = acct_balance;
	}
	
	public FixedDepositAccount(String acct_holder_name, float acct_balance, float interest) {
		super();
		acctHolder = new BankAccountVO(acct_holder_name);
		this.acct_balance = acct_balance;
		if(interest >0 && this.interest != interest && !isInterestUpdated) {
			this.interest = interest;
			isInterestUpdated = true;
		}
	}

	public FixedDepositAccount(String acct_holder_name, float acct_balance, float interest, int duration_mths) {
		
		acctHolder = new BankAccountVO(acct_holder_name);
		this.acct_balance = acct_balance;
		if(interest >0 && this.interest != interest && !isInterestUpdated) {
			this.interest = interest;
			isInterestUpdated = true;
		}
		else {
			throw new IllegalArgumentException("Interest rate cannot be changed to"+ interest+"%");
		}
	}
	
	public float getBalance() {
		float interest_amount = this.acct_balance * (this.interest/100);
		return this.acct_balance + interest_amount;
	}

	public String deposit() {
		return "No Operation";
	}
	
	public String withdraw() {
		return "No Operation";
	}
}
