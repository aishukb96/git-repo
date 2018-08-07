package org.cap.service;

import org.cap.model.Account;
import org.cap.model.Customer;
import org.cap.util.AccountUtil;

public class AccServiceImpl implements IAccountService{

	@Override
	public Account createAccount(Customer customer, double amount) {
		Account account=null;
		if(customer!=null)
		{
			account=new Account();
			account.setCustomer(customer);
			if(amount>0)
			{
				if(amount==1000)
				{
					account.setAccountType("Savings");
					account.setOpeningBalance(amount);
				}
				else if(amount==10000)
				{
					account.setAccountType("Current");
					account.setOpeningBalance(amount);
				}
				else if(amount==100)
				{
					account.setAccountType("RD");
					account.setOpeningBalance(amount);
				}
				else if(amount==500)
				{
					account.setAccountType("FD");
					account.setOpeningBalance(amount);
				}
				account.setAccountNo(AccountUtil.generateAccountNo());
				return account;
			}
		}
		return null;
	}

}
