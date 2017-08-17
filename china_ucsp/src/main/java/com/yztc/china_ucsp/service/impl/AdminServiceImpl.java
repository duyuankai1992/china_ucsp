package com.yztc.china_ucsp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yztc.china_ucsp.entity.Admin;
import com.yztc.china_ucsp.entity.AdminPage;
import com.yztc.china_ucsp.entity.Privilege;
import com.yztc.china_ucsp.mapper.AdminMapper;
import com.yztc.china_ucsp.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Resource
	private AdminMapper adminMapper;
	public void setAdminMapper(AdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}

	@Override
	public Admin login(String admin_code) {
		return adminMapper.findByAdminCode(admin_code);
	}

	@Override
	public List<Integer> findPrivilegeId(Admin admin) {
		return adminMapper.findPrivilegeId(admin.getId());
	}

	@Override
	public List<Privilege> findAllPrivilege() {
		return adminMapper.findAllPrivilege();
	}

	@Override
	public List<Admin> findBypage(AdminPage adminPage) {
		adminPage.setPageSize(8);
		int records=adminMapper.findRecords(adminPage);
		adminPage.setRecords(records);
		System.out.println(adminPage); 
		return adminMapper.findByPage(adminPage);
	}

}
