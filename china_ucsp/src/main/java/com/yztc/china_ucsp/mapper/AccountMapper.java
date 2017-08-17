package com.yztc.china_ucsp.mapper;

import java.util.List;

import com.yztc.china_ucsp.entity.Account;
import com.yztc.china_ucsp.entity.AccountPage;




public interface AccountMapper {
	//分页查询
		public List<Account> findByPage(AccountPage accountpage);
		public int findRecords();
		
		//插入数据
		public Account save(Account account);
		
		//删除数据
		public void delete(Integer id);

		//修改数据
		public Account findbyid(Account id);
		public  void update(Account account);
}
