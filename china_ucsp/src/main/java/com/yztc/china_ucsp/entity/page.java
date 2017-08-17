package com.yztc.china_ucsp.entity;

public class page {
	private int currentPage=1; // ��ǰҳ
	private int pageSize; // ÿҳ��ʾ�ļ�¼��

	private int records; // ���м�¼��
	private int maxPage; // ���ҳ��

	private int nextPage; // ��һҳ
	private int prePage; // ��һҳ
	
	private int begin;   //mysql���ݿ��ҳ�����

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

	// ֻ������ �������ҳ��
	public int getMaxPage() {
		return records % pageSize == 0 ? records / pageSize : records / pageSize + 1;
	}

	// ֻ������ ������һҳ
	public int getNextPage() {
		if (this.currentPage == this.getMaxPage()) {
			return this.getMaxPage();
		}
		return this.currentPage + 1;
	}

	// ֻ������ ������һҳ
	public int getPrePage() {
		if (this.currentPage == 1) {
			return 1;
		}
		return this.currentPage - 1;
	}

	//����mysql���ݿ��ҳ�����
	public int getBegin() {
		return (this.currentPage-1)*this.pageSize;
	}

	

}
