package com.yztc.china_ucsp.service;

import java.util.List;

import com.yztc.china_ucsp.entity.Admin;
import com.yztc.china_ucsp.entity.AdminPage;
import com.yztc.china_ucsp.entity.Privilege;

public interface AdminService {
	//根据账号查询账号信息，并登陆
	public Admin login(String admin_code);
	//根据账号来查询用户权限的ID集合
	public List<Integer> findPrivilegeId(Admin admin);
	//查询用户的权限
	public List<Privilege> findAllPrivilege(); 
	//
	public List<Admin>  findBypage(AdminPage adminPage);
	

}
