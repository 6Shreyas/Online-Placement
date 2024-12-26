package com.placement.dtos;

import org.springframework.web.multipart.MultipartFile;

public class StudentDetailsDTO {

	private int id;
	private String college;
	private String branch;
	private int xthyear;
	private int xiithyear;
	private int gradyear;
	private float xthpercent;
	private float xiithpercent;
	private float gradgpa;
	private MultipartFile resume;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getXthyear() {
		return xthyear;
	}
	public void setXthyear(int xthyear) {
		this.xthyear = xthyear;
	}
	public int getXiithyear() {
		return xiithyear;
	}
	public void setXiithyear(int xiithyear) {
		this.xiithyear = xiithyear;
	}
	public int getGradyear() {
		return gradyear;
	}
	public void setGradyear(int gradyear) {
		this.gradyear = gradyear;
	}
	public float getXthpercent() {
		return xthpercent;
	}
	public void setXthpercent(float xthpercent) {
		this.xthpercent = xthpercent;
	}
	public float getXiithpercent() {
		return xiithpercent;
	}
	public void setXiithpercent(float xiithpercent) {
		this.xiithpercent = xiithpercent;
	}
	public float getGradgpa() {
		return gradgpa;
	}
	public void setGradgpa(float gradgpa) {
		this.gradgpa = gradgpa;
	}
	public MultipartFile getResume() {
		return resume;
	}
	public void setResume(MultipartFile resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "StudentDetailsDTO [id=" + id + ", college=" + college + ", branch=" + branch + ", xthyear=" + xthyear
				+ ", xiithyear=" + xiithyear + ", gradyear=" + gradyear + ", xthpercent=" + xthpercent
				+ ", xiithpercent=" + xiithpercent + ", gradgpa=" + gradgpa + ", resume=" + resume + "]";
	}
	
	
}
