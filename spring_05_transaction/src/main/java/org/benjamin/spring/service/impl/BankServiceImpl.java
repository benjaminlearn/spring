package org.benjamin.spring.service.impl;

import org.benjamin.spring.dao.BankDao;
import org.benjamin.spring.service.BankService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class BankServiceImpl implements BankService {
	private BankDao bankDao;
	
	private TransactionTemplate transactionTemplate;
	
	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void transferAccounts(final int count, final int userIdA, final int userIdB) {
		// TODO Auto-generated method stub
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				bankDao.outMoney(count, userIdA);
				bankDao.inMoney(count, userIdB);				
			}
		});
	}

}
