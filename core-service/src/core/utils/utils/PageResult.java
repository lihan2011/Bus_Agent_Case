package core.utils.utils;

import java.util.List;
import java.util.Map;

public class PageResult {
	
	  // 当前第几页
    private int curPage = 1;
    // 每页记录数
    private int pageSize = 20;
    
    private int startNum;
    
    private int endNum;
    
    // 总记录数
    private int totalRecords;
    // 总页数
    private int totalPages;
    // 结果集
    private List<Map<String, Object>> datas;
    
    
	public int getCurPage() {
		return curPage;
	}
	
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
	public int getStartNum() {		
		return (pageSize * curPage) - pageSize+1;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return (pageSize * curPage);
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public int getTotalRecords() {
		return totalRecords;
	}
	
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	public int getTotalPages() {
		return totalPages;
	}
	
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	public List<Map<String, Object>> getDatas() {
		return datas;
	}
	
	public void setDatas(List<Map<String, Object>> datas) {
		this.datas = datas;
	}
}
