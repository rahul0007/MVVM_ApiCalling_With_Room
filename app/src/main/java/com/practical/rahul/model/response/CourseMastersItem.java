package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CourseMastersItem{

	@SerializedName("CourseName")
	private String courseName;

	@SerializedName("CourseID")
	private String courseID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("BranchID")
	private String branchID;

	public void setCourseName(String courseName){
		this.courseName = courseName;
	}

	public String getCourseName(){
		return courseName;
	}

	public void setCourseID(String courseID){
		this.courseID = courseID;
	}

	public String getCourseID(){
		return courseID;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	@Override
 	public String toString(){
		return 
			"CourseMastersItem{" + 
			"courseName = '" + courseName + '\'' + 
			",courseID = '" + courseID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",branchID = '" + branchID + '\'' + 
			"}";
		}
}