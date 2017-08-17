package com.yztc.china_ucsp.service;

import java.util.List;

import com.yztc.china_ucsp.entity.Admin;
import com.yztc.china_ucsp.entity.AdminPage;
import com.yztc.china_ucsp.entity.Privilege;

public interface AdminService {
	//�����˺Ų�ѯ�˺���Ϣ������½
	public Admin login(String admin_code);
	//�����˺�����ѯ�û�Ȩ�޵�ID����
	public List<Integer> findPrivilegeId(Admin admin);
	//��ѯ�û���Ȩ��
	public List<Privilege> findAllPrivilege(); 
	//
	public List<Admin>  findBypage(AdminPage adminPage);
	

}
