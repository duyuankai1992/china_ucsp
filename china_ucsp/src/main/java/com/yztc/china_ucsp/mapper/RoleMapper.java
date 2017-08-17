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
	 * TODO ��������ӽ�ɫ��Ȩ�޵Ķ�Ӧ��ϵ�����ݱ��浽�м����
	 * 
	 * @param Map<String,Integer> map ����ӽ�ɫ��ź���ѡȨ�޵ı��
	 * 
	 */
	public void saveRolePrivilege(Map<String,Integer> map);
	
	
	/*����*/
	public Role findById(Integer roleId);	
	public List<Integer> findPrivilegeIds(Integer roleId);	
	public void update(Role role);	
	/*�޸Ľ�ɫȨ�ޣ�����ɾ��ԭ��Ȩ�� ������û���ѡȨ��*/
	public void deleteRolePrivilege(int roleId);
	
	
	
	/*ɾ����ɫ*/
	public void delete(Integer roleID);
	
}
