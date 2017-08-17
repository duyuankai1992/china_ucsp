package com.yztc.china_ucsp.web.controller;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yztc.china_ucsp.entity.Admin;
import com.yztc.china_ucsp.entity.Privilege;
import com.yztc.china_ucsp.service.AdminService;
import com.yztc.ucsp.util.ImageUtil;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private static final int ADMINCODE_ERROR = 0;	
	private static final int PASSWORD_ERROR = 1;	
	private static final int CHECKCODE_ERROR = 2;	
	private static final int ACCOUNT_RIGHT = 3;
	
	@Resource
	private AdminService adminService;
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	@RequestMapping("/toLogin.do")
	public String toLogin(){
		return "login/login";
	}
	
	@RequestMapping("/toIndex.do")
	public String toIndex(HttpSession session){
		return "main/index";
	}
	
	@RequestMapping("/toNoPower.do")
	public String toNoPower(){
		return "main/nopower";
	}
	
	@RequestMapping("/getCode.do")
	public String getCode(HttpSession session,HttpServletResponse response)throws Exception{
		//ͨ��������������֤���ݺ��ڴ�ͼƬ
		Map<String,BufferedImage> map = ImageUtil.createImage();		
		//��ȡ��֤������
		String code = map.keySet().iterator().next();		
		session.setAttribute("code", code);		
		//��ȡ�ڴ�ͼƬ   
		BufferedImage bim = map.get(code);
		//��ͼƬ���͵������
		ImageIO.write(bim, "jpeg", response.getOutputStream());
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/login.do")
	public int login(String admin_code,String password,String checkCode,HttpSession session){
		
		String code = (String) session.getAttribute("code");
		if(!checkCode.equalsIgnoreCase(code)){
			return LoginController.CHECKCODE_ERROR;
		}
		Admin admin = adminService.login(admin_code);
		if(admin==null){
			return LoginController.ADMINCODE_ERROR;
		}
		if(!admin.getPassword().equals(password)){
			return LoginController.PASSWORD_ERROR;
		}
		//����û��˺�������֤����֤�ɹ�����ѯ��¼�û���Ȩ�ޣ��Լ�ϵͳ������Ȩ��
		List<Integer> privilegeIds = adminService.findPrivilegeId(admin);
		session.setAttribute("privilegeIds", privilegeIds);		
		List<Privilege> listPrivileges = adminService.findAllPrivilege();
		session.setAttribute("listPrivileges", listPrivileges);
		
		session.setAttribute("admin", admin);		
		return LoginController.ACCOUNT_RIGHT;
	}
	
	

}
