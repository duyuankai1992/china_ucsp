package com.yztc.china_ucsp.service;

import java.util.List;

import com.yztc.china_ucsp.entity.Cost;
import com.yztc.china_ucsp.entity.CostPage;


public interface CostService {
	
   public Cost findbyid(Cost id);
   
   public List<Cost> findByPage(CostPage costPage);
   
   public Cost save(Cost cost);
   
   public void delete(Integer costID);
	
	public void update(Cost cost );
	
    public void sortByBaseCost();
	
	public void sortByBaseDuration();
}
