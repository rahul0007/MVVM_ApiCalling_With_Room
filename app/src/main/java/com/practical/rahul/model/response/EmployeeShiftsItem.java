package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class EmployeeShiftsItem{

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("EndTime")
	private String endTime;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("StartTime")
	private String startTime;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("GiveOT")
	private String giveOT;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("BranchEmployeeShiftID")
	private String branchEmployeeShiftID;

	@SerializedName("DayID")
	private String dayID;

	@SerializedName("BranchEmployeeScheduleID")
	private String branchEmployeeScheduleID;

	@SerializedName("ExtraOTPer")
	private String extraOTPer;

	@SerializedName("IPAddress")
	private String iPAddress;

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	public String getEndTime(){
		return endTime;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
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

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setGiveOT(String giveOT){
		this.giveOT = giveOT;
	}

	public String getGiveOT(){
		return giveOT;
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

	public void setBranchEmployeeShiftID(String branchEmployeeShiftID){
		this.branchEmployeeShiftID = branchEmployeeShiftID;
	}

	public String getBranchEmployeeShiftID(){
		return branchEmployeeShiftID;
	}

	public void setDayID(String dayID){
		this.dayID = dayID;
	}

	public String getDayID(){
		return dayID;
	}

	public void setBranchEmployeeScheduleID(String branchEmployeeScheduleID){
		this.branchEmployeeScheduleID = branchEmployeeScheduleID;
	}

	public String getBranchEmployeeScheduleID(){
		return branchEmployeeScheduleID;
	}

	public void setExtraOTPer(String extraOTPer){
		this.extraOTPer = extraOTPer;
	}

	public String getExtraOTPer(){
		return extraOTPer;
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
			"EmployeeShiftsItem{" + 
			"createdBy = '" + createdBy + '\'' + 
			",endTime = '" + endTime + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",giveOT = '" + giveOT + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",branchEmployeeShiftID = '" + branchEmployeeShiftID + '\'' + 
			",dayID = '" + dayID + '\'' + 
			",branchEmployeeScheduleID = '" + branchEmployeeScheduleID + '\'' + 
			",extraOTPer = '" + extraOTPer + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}