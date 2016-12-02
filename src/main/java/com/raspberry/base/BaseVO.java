package com.raspberry.base;

import java.util.ArrayList;
import java.util.List;

import com.raspberry.utils.PageModel;


public class BaseVO<E> {

	private PageModel pageModel = new PageModel();

	private List<E> result = new ArrayList<E>();

	private int pageNum = 1;

	public PageModel getPageModel() {
		return pageModel;
	}

	public void setPageModel(PageModel pageModel) {
		this.pageModel = pageModel;
	}

	public List<E> getResult() {
		return result;
	}

	public void setResult(List<E> result) {
		this.result = result;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageModel.setCurrentPage(pageNum);
		this.pageNum = pageNum;
	}

}
