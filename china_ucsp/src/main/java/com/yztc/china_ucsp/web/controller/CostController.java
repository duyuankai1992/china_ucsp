package com.yztc.china_ucsp.web.controller;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yztc.china_ucsp.entity.Cost;
import com.yztc.china_ucsp.entity.CostPage;

import com.yztc.china_ucsp.service.CostService;

@Controller
@RequestMapping("/fee")
public class CostController {
	@Resource
	private CostService costService;
	public void setCostService(CostService costService) {
		this.costService = costService;
	}
	@RequestMapping("/findByPage.do")
	public String findByPage(CostPage  costPage,Model model){
		List<Cost> listCost = costService.findByPage(costPage);
		model.addAttribute("listCost",listCost);
		model.addAttribute("costPage",costPage);
		
		return "fee/fee_list";
	}
	
	@RequestMapping("/toAdd.do")
	public String add(Cost cost){
		return "fee/fee_add";
	}
	@RequestMapping("/Add.do")
	public String toadd(Cost cost){
		costService.save(cost);
		return "redirect:findByPage.do";
	}
	
	
	
	@RequestMapping("/toUpdate.do")
	public String update(Cost id,Model model ) {
		Cost   listCost= costService.findbyid(id);
		System.out.println(listCost);
		model.addAttribute("listCost", listCost);
		return "fee/fee_modi";
	}
	
	@RequestMapping("/Update.do")
	public String toUpdate(Cost cost){	
	costService.update(cost);
	System.out.println(cost);
		return "redirect:findByPage.do";
	}
	@RequestMapping("/todelete.do")
	public String delete(Integer costID) {
		costService.delete(costID);
		return "redirect:findByPage.do";
	}
	
	@RequestMapping("/sortByBaseCost.do")
	public String sort() {
		costService.sortByBaseCost();
		return "redirect:findByPage.do";
	}
	
	@RequestMapping("/sortByBaseDuration.do")
	public String sortd() {
		costService.sortByBaseDuration();
		return "redirect:findByPage.do";
	}
	
	
}
