package com.raspberry.utils;

public class PageModel {

	// 当前页数
	private int currentPage = 1;
	// 每页显示多少条
	private int numPerPage = 20;
	// 总页数
	private int totalPage;
	// 总数量
	private int totalCount;
	// 分页
	private int offset;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
		this.offset = (this.currentPage - 1) * this.numPerPage;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		this.totalPage = totalCount % this.numPerPage == 0 ? totalCount
				/ this.numPerPage : totalCount / this.numPerPage + 1;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
}
