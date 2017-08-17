package com.yztc.china_ucsp.web.controller;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yztc.china_ucsp.entity.Account;
import com.yztc.china_ucsp.entity.AccountPage;
import com.yztc.china_ucsp.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Resource
	public AccountService accountService;
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	@RequestMapping("/findByPage.do")
	public String findByPage(AccountPage  accountPage,Model model){
		List<Account> listaccount=accountService.findByPage(accountPage);
		model.addAttribute("listaccount",listaccount);
		model.addAttribute("accountPage",accountPage);
		return "account/account_list";	
	}
	@RequestMapping("/toAdd.do")
	public String toAdd(Account account) {
		
		return "account/account_add";	
		
	}
	@RequestMapping("/Add.do")
	public String Add(Account account) {
		accountService.save(account);
		return "account/account_add";	
		
	}
	
	@RequestMapping("/delete.do")
	public String delete(Integer id) {
		accountService.delete(id);
		return "redirect:findByPage.do";	
		
	}
	
	@RequestMapping("/toUpade.do")
	public String toUpdate(Account id,Model model) {
		Account listaccount=accountService.findbyid(id);
		System.out.println(id);
		System.out.println(listaccount);
		model.addAttribute("listaccount", listaccount);
		return "account/account_modi";	
		
	}
	@RequestMapping("/update.do")
	public String Update(Account account) {
		accountService.update(account);
		System.out.println(account);
		return "redirect:findByPage.do";	
		
	}
	
	
}
