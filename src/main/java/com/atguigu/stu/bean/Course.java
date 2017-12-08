package com.atguigu.stu.bean;

public class Course {
	private int courId;
	private String courName;
	public int getCourId() {
		return courId;
	}
	public void setCourId(int courId) {
		this.courId = courId;
	}
	public String getCourName() {
		return courName;
	}
	public void setCourName(String courName) {
		this.courName = courName;
	}
	@Override
	public String toString() {
		return "Course [courId=" + courId + ", courName=" + courName + "]";
	}
	
	
}
