package com.yztc.china_ucsp.mapper;

import java.util.List;

import com.yztc.china_ucsp.entity.Admin;
import com.yztc.china_ucsp.entity.AdminPage;
import com.yztc.china_ucsp.entity.Privilege;

public interface AdminMapper {
	
	/**
	 * 
	 * TODO 根据账号查询账号信息
	 * 
	 */
	public Admin findByAdminCode(String admin_code);
	/**
	 * 
	 * TODO 根据系统用户的ID查询该用户的权限编号
	 * 
	 */
	public List<Integer> findPrivilegeId(Integer admin_id);
	
	/**
	 * 
	 * TODO 查询所有权限
	 * 
	 */
	public List<Privilege> findAllPrivilege();
	/**
	 * 
	 * TODO 根据动态条件分页查询管理员信息
	 *      动态条件：角色名字或权限ID
	 */
	public List<Admin> findByPage(AdminPage adminPage);
	/**
	 * 
	 * TODO 根据动态条件分页查询管理员信息的记录数
	 *      动态条件：角色名字或权限ID
	 */
	public int findRecords(AdminPage adminPage);
	
	
	
}
