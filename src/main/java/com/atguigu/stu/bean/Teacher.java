package com.atguigu.stu.bean;

public class Teacher {
	private String teaId;
	private String teaName;
	public String getTeaId() {
		return teaId;
	}
	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	@Override
	public String toString() {
		return "Teacher [teaId=" + teaId + ", teaName=" + teaName + "]";
	}
	
	
}
