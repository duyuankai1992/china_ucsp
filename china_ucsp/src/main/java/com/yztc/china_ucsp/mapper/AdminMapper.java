package com.yztc.china_ucsp.mapper;

import java.util.List;

import com.yztc.china_ucsp.entity.Admin;
import com.yztc.china_ucsp.entity.AdminPage;
import com.yztc.china_ucsp.entity.Privilege;

public interface AdminMapper {
	
	/**
	 * 
	 * TODO �����˺Ų�ѯ�˺���Ϣ
	 * 
	 */
	public Admin findByAdminCode(String admin_code);
	/**
	 * 
	 * TODO ����ϵͳ�û���ID��ѯ���û���Ȩ�ޱ��
	 * 
	 */
	public List<Integer> findPrivilegeId(Integer admin_id);
	
	/**
	 * 
	 * TODO ��ѯ����Ȩ��
	 * 
	 */
	public List<Privilege> findAllPrivilege();
	/**
	 * 
	 * TODO ���ݶ�̬������ҳ��ѯ����Ա��Ϣ
	 *      ��̬��������ɫ���ֻ�Ȩ��ID
	 */
	public List<Admin> findByPage(AdminPage adminPage);
	/**
	 * 
	 * TODO ���ݶ�̬������ҳ��ѯ����Ա��Ϣ�ļ�¼��
	 *      ��̬��������ɫ���ֻ�Ȩ��ID
	 */
	public int findRecords(AdminPage adminPage);
	
	
	
}
