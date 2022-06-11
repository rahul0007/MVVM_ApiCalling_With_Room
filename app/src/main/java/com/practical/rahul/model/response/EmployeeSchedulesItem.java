package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class EmployeeSchedulesItem{

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("StaffID")
	private String staffID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("AssignStaffRoleID")
	private String assignStaffRoleID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("ShiftLabelID")
	private String shiftLabelID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("FromDate")
	private String fromDate;

	@SerializedName("ToDate")
	private String toDate;

	@SerializedName("BranchEmployeeScheduleID")
	private String branchEmployeeScheduleID;

	@SerializedName("IPAddress")
	private String iPAddress;

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setStaffID(String staffID){
		this.staffID = staffID;
	}

	public String getStaffID(){
		return staffID;
	}

	public void setUpdatedDate(String updatedDate){
		this.updatedDate = updatedDate;
	}

	public String getUpdatedDate(){
		return updatedDate;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setAssignStaffRoleID(String assignStaffRoleID){
		this.assignStaffRoleID = assignStaffRoleID;
	}

	public String getAssignStaffRoleID(){
		return assignStaffRoleID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setShiftLabelID(String shiftLabelID){
		this.shiftLabelID = shiftLabelID;
	}

	public String getShiftLabelID(){
		return shiftLabelID;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setFromDate(String fromDate){
		this.fromDate = fromDate;
	}

	public String getFromDate(){
		return fromDate;
	}

	public void setToDate(String toDate){
		this.toDate = toDate;
	}

	public String getToDate(){
		return toDate;
	}

	public void setBranchEmployeeScheduleID(String branchEmployeeScheduleID){
		this.branchEmployeeScheduleID = branchEmployeeScheduleID;
	}

	public String getBranchEmployeeScheduleID(){
		return branchEmployeeScheduleID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	@Override
 	public String toString(){
		return 
			"EmployeeSchedulesItem{" + 
			"createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",staffID = '" + staffID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",assignStaffRoleID = '" + assignStaffRoleID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",shiftLabelID = '" + shiftLabelID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",fromDate = '" + fromDate + '\'' + 
			",toDate = '" + toDate + '\'' + 
			",branchEmployeeScheduleID = '" + branchEmployeeScheduleID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}