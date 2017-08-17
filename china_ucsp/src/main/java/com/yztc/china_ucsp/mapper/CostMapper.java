package com.yztc.china_ucsp.mapper;

import java.util.List;

import com.yztc.china_ucsp.entity.Cost;
import com.yztc.china_ucsp.entity.CostPage;


public interface CostMapper {
	
	
	//��ҳ��ѯ
	public List<Cost> findByPage(CostPage costPage);
	public int findRecords();
	
	//��������
	public Cost save(Cost cost);
	//ɾ������
	public void delete(Integer costID);
	//����
	public Cost findbyid(Cost id);
	public void update(Cost cost);
	
	//����������
	public void sortByBaseCost();
	//��ʱ������
	public void sortByBaseDuration();
}
