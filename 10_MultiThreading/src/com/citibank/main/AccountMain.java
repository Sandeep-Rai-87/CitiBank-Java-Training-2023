package com.citibank.main;

import com.citibank.main.domain.Account;
import com.citibank.main.domain.AccountThread;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		AccountThread accountWithdraw = new AccountThread(account, 1, 2000);
		Thread withdrawThread = new Thread(accountWithdraw);
		withdrawThread.start();
		
		AccountThread accountDeposit = new AccountThread(account, 2, 3000);
		Thread depositThread = new Thread(accountDeposit);
		depositThread.start();

	}

}
