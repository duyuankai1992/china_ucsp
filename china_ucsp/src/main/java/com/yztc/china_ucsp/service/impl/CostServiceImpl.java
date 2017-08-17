package com.yztc.china_ucsp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yztc.china_ucsp.entity.Cost;
import com.yztc.china_ucsp.entity.CostPage;
import com.yztc.china_ucsp.mapper.CostMapper;
import com.yztc.china_ucsp.service.CostService;
@Service("costService")
public class CostServiceImpl implements CostService {
     @Resource
	  public CostMapper costmapper; 
	 public void setCostmapper(CostMapper costmapper) {
		this.costmapper = costmapper;
	}



	@Override
	public Cost findbyid(Cost id) {
		// TODO Auto-generated method stub
		return costmapper.findbyid(id);
	}



	@Override
	public List<Cost> findByPage(CostPage costPage) {
		// TODO Auto-generated method stub
		costPage.setPageSize(2);
		costPage.setRecords(costmapper.findRecords());
		System.out.println(costPage);
		return costmapper.findByPage(costPage);
	}






	@Override
	public void delete(Integer costID) {
		// TODO Auto-generated method stub
		costmapper.delete(costID);
	}



	



	@Override
	public Cost save( Cost cost) {
		// TODO Auto-generated method stub
		return costmapper.save(cost);
	}



	@Override
	public void update(Cost cost) {
		// TODO Auto-generated method stub
		 costmapper.update(cost);
	
	}



	@Override
	public void sortByBaseCost() {
		// TODO Auto-generated method stub
		costmapper.sortByBaseCost();
	}



	@Override
	public void sortByBaseDuration() {
		// TODO Auto-generated method stub
		costmapper.sortByBaseDuration();
	}



	



	



	



	



	

}
