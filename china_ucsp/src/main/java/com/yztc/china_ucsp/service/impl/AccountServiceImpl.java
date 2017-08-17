package com.yztc.china_ucsp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yztc.china_ucsp.entity.Account;
import com.yztc.china_ucsp.entity.AccountPage;
import com.yztc.china_ucsp.mapper.AccountMapper;
import com.yztc.china_ucsp.service.AccountService;
@Service("accountService")
public class AccountServiceImpl  implements AccountService{
      @Resource
	  private AccountMapper accountMapper;
	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}


	@Override
	public List<Account> findByPage(AccountPage accountPage) {
		// TODO Auto-generated method stub
		accountPage.setPageSize(3);
		accountPage.setRecords(accountMapper.findRecords());
		return accountMapper.findByPage(accountPage);
	}


	@Override
	public Account save(Account account) {
		// TODO Auto-generated method stub
		return accountMapper.save(account);
	}


	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		accountMapper.delete(id);
	}




	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		System.out.println(account);
		accountMapper.update(account);
	}


	@Override
	public Account findbyid(Account id) {
		// TODO Auto-generated method stub
	    Account a	=accountMapper.findbyid(id);
	
		return a;
		
	}

}
