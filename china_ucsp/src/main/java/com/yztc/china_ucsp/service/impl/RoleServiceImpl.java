package com.yztc.china_ucsp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yztc.china_ucsp.entity.Privilege;
import com.yztc.china_ucsp.entity.Role;
import com.yztc.china_ucsp.entity.RolePage;
import com.yztc.china_ucsp.mapper.AdminMapper;
import com.yztc.china_ucsp.mapper.RoleMapper;
import com.yztc.china_ucsp.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Resource
	private RoleMapper roleMapper;
	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}
	@Resource
	private AdminMapper adminMapper;
	public void setAdminMapper(AdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}

	@Override
	public List<Role> findByPage(RolePage rolePage) {
		rolePage.setPageSize(4);
		rolePage.setRecords(roleMapper.findRecords());
		return roleMapper.findByPage(rolePage);
	}

	@Override
	public Role findById(Integer roleId) {
		return roleMapper.findById(roleId);
	}

	@Override
	public List<Integer> findPrivilegeIds(Integer roleId) {
		return roleMapper.findPrivilegeIds(roleId);
	}
	
	public List<Privilege> findAllPrivilege(){
		return adminMapper.findAllPrivilege();
	}

	@Override
	@Transactional
	public void update(Role role, Integer[] privilegeIds) {
		//更新角色名称
		roleMapper.update(role);
		//删除角色原有权限
		roleMapper.deleteRolePrivilege(role.getId());
		//添加所选权限
		for(Integer privilegeId:privilegeIds){
			Map<String,Integer> map = new HashMap<String,Integer>();
			map.put("roleId", role.getId());
			map.put("privilegeId", privilegeId);
			roleMapper.saveRolePrivilege(map);
			System.out.println(map);
		}
		
	}

	@Override
	public void add(Role role, Integer[] privilegeIds) {
		// TODO Auto-generated method stub
		roleMapper.save(role);
		for(Integer privilegeId:privilegeIds){
			Map<String,Integer> map = new HashMap<String,Integer>();
			map.put("roleId", role.getId());
			map.put("privilegeId", privilegeId);
			roleMapper.saveRolePrivilege(map);
			System.out.println(map);
		}
	}

	@Override
	public void  delete(Integer roleID) {
		// TODO Auto-generated method stub
		roleMapper.delete(roleID);
		roleMapper.deleteRolePrivilege(roleID);
	} 

	
	

	

	

	

	
 		
 		
	

}