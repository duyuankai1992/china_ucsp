 package com.yztc.china_ucsp.mapper;

import java.util.List;
import java.util.Map;

import com.yztc.china_ucsp.entity.Role;
import com.yztc.china_ucsp.entity.RolePage;

public interface RoleMapper {
	public List<Role> findByPage(RolePage rolePage);
	public int findRecords();
	
	public void save(Role role);
	/**
	 * 
	 * TODO 保存新添加角色与权限的对应关系，数据保存到中间表中
	 * 
	 * @param Map<String,Integer> map 新添加角色编号和所选权限的编号
	 * 
	 */
	public void saveRolePrivilege(Map<String,Integer> map);
	
	
	/*更新*/
	public Role findById(Integer roleId);	
	public List<Integer> findPrivilegeIds(Integer roleId);	
	public void update(Role role);	
	/*修改角色权限，首先删除原有权限 再添加用户所选权限*/
	public void deleteRolePrivilege(int roleId);
	
	
	
	/*删除角色*/
	public void delete(Integer roleID);
	
}
