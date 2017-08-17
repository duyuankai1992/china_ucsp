package com.yztc.china_ucsp.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yztc.china_ucsp.entity.Privilege;
import com.yztc.china_ucsp.entity.Role;
import com.yztc.china_ucsp.entity.RolePage;
import com.yztc.china_ucsp.mapper.RoleMapper;
import com.yztc.china_ucsp.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	
	@Resource
	private RoleService roleService;
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}		

	@RequestMapping("/findByPage.do")
	public String findByPage(RolePage rolePage,Model model){
		
		List<Role> listRole = roleService.findByPage(rolePage);
	    //��Ž�ɫ��Ȩ�޵ȵ�
		model.addAttribute("listRole", listRole);
		//�����һҳ����һҳ�ȵ��õ�
		model.addAttribute("rolePage",rolePage);
		System.out.println(model);
		return "role/role_list";
		
	}
	
	@RequestMapping("/toUpdate.do")
	public String toUpdate(Integer roleId,Model model){
		//���޸Ľ�ɫ
		Role role = roleService.findById(roleId);
		//����Ȩ��
		List<Privilege> listPrivilege = roleService.findAllPrivilege();
		//���޸Ľ�ɫ�߱���Ȩ�ޱ��
		List<Integer> listPrivilegeId = roleService.findPrivilegeIds(roleId);
		
		model.addAttribute("role",role);
		model.addAttribute("listPrivilege",listPrivilege);
		model.addAttribute("listPrivilegeId",listPrivilegeId);
		
		return "role/role_modi";
	}
	@RequestMapping("/update.do")
	public String update(Role role,Integer[] privilegeIds){
		roleService.update(role, privilegeIds);
		return "redirect:/role/findByPage.do" ;
	}
	@RequestMapping("/toAdd.do")
	public String toAdd(Model model){
		
		List<Privilege> listPrivilege = roleService.findAllPrivilege();
//		List<Integer> listPrivilegeId = roleService.findPrivilegeIds(roleID);
		model.addAttribute("listPrivilege",listPrivilege);
		//.addAttribute("listPrivilegeId",listPrivilegeId);
		System.out.println(model);
		return "role/role_add";
	}
	
	
	@RequestMapping("/add.do")
	public String add(Role role,Integer[] privilegeIds){
		System.out.println(1);
		roleService.add(role, privilegeIds);
		return "redirect:/role/findByPage.do";
	}
	@RequestMapping("/delete.do")
	public String delete(Role role){
		roleService.delete(role.getId());
		System.out.println(role);
		return "redirect:/role/findByPage.do";
	}
	

	
	
	
	
	
	
	
}
