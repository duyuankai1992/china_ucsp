package com.yztc.china_ucsp.entity;

public class page {
	private int currentPage=1; // 当前页
	private int pageSize; // 每页显示的记录数

	private int records; // 所有记录数
	private int maxPage; // 最大页数

	private int nextPage; // 下一页
	private int prePage; // 上一页
	
	private int begin;   //mysql数据库分页的起点

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}

	// 只读属性 计算最大页数
	public int getMaxPage() {
		return records % pageSize == 0 ? records / pageSize : records / pageSize + 1;
	}

	// 只读属性 计算下一页
	public int getNextPage() {
		if (this.currentPage == this.getMaxPage()) {
			return this.getMaxPage();
		}
		return this.currentPage + 1;
	}

	// 只读属性 计算上一页
	public int getPrePage() {
		if (this.currentPage == 1) {
			return 1;
		}
		return this.currentPage - 1;
	}

	//计算mysql数据库分页的起点
	public int getBegin() {
		return (this.currentPage-1)*this.pageSize;
	}

	

}
