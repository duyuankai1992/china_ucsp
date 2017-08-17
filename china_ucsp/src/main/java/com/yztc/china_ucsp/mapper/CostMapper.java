package com.yztc.china_ucsp.mapper;

import java.util.List;

import com.yztc.china_ucsp.entity.Cost;
import com.yztc.china_ucsp.entity.CostPage;


public interface CostMapper {
	
	
	//分页查询
	public List<Cost> findByPage(CostPage costPage);
	public int findRecords();
	
	//插入数据
	public Cost save(Cost cost);
	//删除数据
	public void delete(Integer costID);
	//更新
	public Cost findbyid(Cost id);
	public void update(Cost cost);
	
	//按花费排序
	public void sortByBaseCost();
	//按时长排序
	public void sortByBaseDuration();
}
