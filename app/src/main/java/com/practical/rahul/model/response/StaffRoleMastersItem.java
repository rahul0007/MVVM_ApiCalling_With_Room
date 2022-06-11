package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class StaffRoleMastersItem{

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("PayRateSalary")
	private String payRateSalary;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("PayTypeID")
	private String payTypeID;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("DayEnd")
	private String dayEnd;

	@SerializedName("DayStart")
	private String dayStart;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("RoleName")
	private String roleName;

	@SerializedName("RequireEndOfShift")
	private String requireEndOfShift;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("StaffRoleID")
	private String staffRoleID;

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

	public void setPayRateSalary(String payRateSalary){
		this.payRateSalary = payRateSalary;
	}

	public String getPayRateSalary(){
		return payRateSalary;
	}

	public void setUpdatedDate(String updatedDate){
		this.updatedDate = updatedDate;
	}

	public String getUpdatedDate(){
		return updatedDate;
	}

	public void setPayTypeID(String payTypeID){
		this.payTypeID = payTypeID;
	}

	public String getPayTypeID(){
		return payTypeID;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setDayEnd(String dayEnd){
		this.dayEnd = dayEnd;
	}

	public String getDayEnd(){
		return dayEnd;
	}

	public void setDayStart(String dayStart){
		this.dayStart = dayStart;
	}

	public String getDayStart(){
		return dayStart;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setRoleName(String roleName){
		this.roleName = roleName;
	}

	public String getRoleName(){
		return roleName;
	}

	public void setRequireEndOfShift(String requireEndOfShift){
		this.requireEndOfShift = requireEndOfShift;
	}

	public String getRequireEndOfShift(){
		return requireEndOfShift;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setStaffRoleID(String staffRoleID){
		this.staffRoleID = staffRoleID;
	}

	public String getStaffRoleID(){
		return staffRoleID;
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
			"StaffRoleMastersItem{" + 
			"createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",payRateSalary = '" + payRateSalary + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",payTypeID = '" + payTypeID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",dayEnd = '" + dayEnd + '\'' + 
			",dayStart = '" + dayStart + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",roleName = '" + roleName + '\'' + 
			",requireEndOfShift = '" + requireEndOfShift + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",staffRoleID = '" + staffRoleID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}