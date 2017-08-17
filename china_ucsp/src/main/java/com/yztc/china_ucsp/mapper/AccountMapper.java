package com.yztc.china_ucsp.mapper;

import java.util.List;

import com.yztc.china_ucsp.entity.Account;
import com.yztc.china_ucsp.entity.AccountPage;




public interface AccountMapper {
	//��ҳ��ѯ
		public List<Account> findByPage(AccountPage accountpage);
		public int findRecords();
		
		//��������
		public Account save(Account account);
		
		//ɾ������
		public void delete(Integer id);

		//�޸�����
		public Account findbyid(Account id);
		public  void update(Account account);
}
