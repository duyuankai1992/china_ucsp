package com.yztc.china_ucsp.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yztc.china_ucsp.entity.Admin;
import com.yztc.china_ucsp.entity.AdminPage;
import com.yztc.china_ucsp.entity.Privilege;
import com.yztc.china_ucsp.entity.Role;
import com.yztc.china_ucsp.service.AdminService;

@RequestMapping("/admin")
@Controller
public class AdminController {
	
	@Resource
	private AdminService adminService;
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	@RequestMapping("/findByPage.do")
	public String findByPage(AdminPage adminPage ,Model model){
		List<Admin> listAdmin = adminService.findBypage(adminPage);
		model.addAttribute("adminPage",adminPage);
		model.addAttribute("listAdmin",listAdmin);
		model.addAttribute("listPrivileges", adminService.findAllPrivilege());
		return "admin/admin_list";
	}
	//映射 增加的功能  没写
	@RequestMapping("/toAdd.do")
	public String toAdd(Model model){
		
	
		return "admin/admin_add";
	}
	// 映射更新的功能  没写
	@RequestMapping("/toUpdate.do")
	public String toUpdate(Model model){
		
	
		return "admin/admin_modi";
	}
	//映射 删除的功能   没写
	@RequestMapping("/delete.do")
	public String delete(Role role){
	
		return "redirect:/role/findByPage.do";
	}
	
	@RequestMapping("/findByIf.do")
	public String userIf(){
	
		return "user/user_info";
	}
	@RequestMapping("/findByPa.do")
	public String user(){
	
		return "user/user_modi_pwd";
	}
}
