package com.atguigu.stu.bean;

public class Grade {
	private String stuId;
	private int courId;
	private int grade;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public int getCourId() {
		return courId;
	}
	public void setCourId(int courId) {
		this.courId = courId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Grade [stuId=" + stuId + ", courId=" + courId + ", grade=" + grade + "]";
	}
	
	
}
