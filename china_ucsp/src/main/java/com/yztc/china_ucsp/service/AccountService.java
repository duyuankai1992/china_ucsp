package com.yztc.china_ucsp.service;

import java.util.List;

import com.yztc.china_ucsp.entity.Account;
import com.yztc.china_ucsp.entity.AccountPage;



public interface AccountService {

	 public List<Account> findByPage(AccountPage accountPage);
	 
	 public Account save(Account account);
	 
	 public void delete(Integer id);
	 
	 public Account findbyid(Account id);
	 public void update(Account account);
}
