package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class StaffRolesItem{

	@SerializedName("Salary")
	private String salary;

	@SerializedName("StaffID")
	private String staffID;

	@SerializedName("PayTypeID")
	private String payTypeID;

	@SerializedName("AssignStaffRoleID")
	private String assignStaffRoleID;

	@SerializedName("StaffRoleID")
	private String staffRoleID;

	public void setSalary(String salary){
		this.salary = salary;
	}

	public String getSalary(){
		return salary;
	}

	public void setStaffID(String staffID){
		this.staffID = staffID;
	}

	public String getStaffID(){
		return staffID;
	}

	public void setPayTypeID(String payTypeID){
		this.payTypeID = payTypeID;
	}

	public String getPayTypeID(){
		return payTypeID;
	}

	public void setAssignStaffRoleID(String assignStaffRoleID){
		this.assignStaffRoleID = assignStaffRoleID;
	}

	public String getAssignStaffRoleID(){
		return assignStaffRoleID;
	}

	public void setStaffRoleID(String staffRoleID){
		this.staffRoleID = staffRoleID;
	}

	public String getStaffRoleID(){
		return staffRoleID;
	}

	@Override
 	public String toString(){
		return 
			"StaffRolesItem{" + 
			"salary = '" + salary + '\'' + 
			",staffID = '" + staffID + '\'' + 
			",payTypeID = '" + payTypeID + '\'' + 
			",assignStaffRoleID = '" + assignStaffRoleID + '\'' + 
			",staffRoleID = '" + staffRoleID + '\'' + 
			"}";
		}
}