package com.yztc.china_ucsp.service;

import java.util.List;

import com.yztc.china_ucsp.entity.Privilege;
import com.yztc.china_ucsp.entity.Role;
import com.yztc.china_ucsp.entity.RolePage;


public interface RoleService {
	
	
	public List<Role> findByPage(RolePage rolePage);
	
	public Role findById(Integer id);
	
	public List<Integer> findPrivilegeIds(Integer roleId);	
	
	public List<Privilege> findAllPrivilege();
	
	public void update(Role role,Integer[] privilegeIds);
	
	public void  add(Role role,Integer[] privilegeIds);
	
	public void  delete(Integer roleID );
	
	
	
	
}
