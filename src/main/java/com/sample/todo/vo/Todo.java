package com.sample.todo.vo;

public class Todo {

	private long no;
	private String title;
	private String dates;
	private String contents;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return "Todo [no=" + no + ", title=" + title + ", dates=" + dates + ", contents=" + contents + "]";
	}
	
	
}
