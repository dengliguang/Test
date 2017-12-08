package com.atguigu.stu.bean;

public class Student {
	private String stuId;
	private String stuName;
	private int stuAge;
	private char stuSex;
	private String stuDepartment;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public char getStuSex() {
		return stuSex;
	}
	public void setStuSex(char stuSex) {
		this.stuSex = stuSex;
	}
	public String getStuDepartment() {
		return stuDepartment;
	}
	public void setStuDepartment(String stuDepartment) {
		this.stuDepartment = stuDepartment;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuSex=" + stuSex
				+ ", stuDepartment=" + stuDepartment + "]";
	}
	public Student(String stuId, String stuName, int stuAge, char stuSex, String stuDepartment) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
		this.stuDepartment = stuDepartment;
	}
	public Student() {
		super();
	}
	
	
}
