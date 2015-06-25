package org.benjamin.spring.service.impl;

import org.benjamin.spring.dao.BankDao;
import org.benjamin.spring.service.BankService;

public class BankServiceImpl implements BankService {
	private BankDao bankDao;
	
	
	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}

	public void transferAccounts(final int count, final int userIdA, final int userIdB) {
		// TODO Auto-generated method stub
		bankDao.outMoney(count, userIdA);
		bankDao.inMoney(count, userIdB);
	}

}
