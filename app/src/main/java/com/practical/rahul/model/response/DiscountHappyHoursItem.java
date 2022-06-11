package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class DiscountHappyHoursItem{

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

	@SerializedName("DiscountID")
	private String discountID;

	@SerializedName("DiscountHappyHoursID")
	private String discountHappyHoursID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("DayID")
	private String dayID;

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

	public void setDiscountID(String discountID){
		this.discountID = discountID;
	}

	public String getDiscountID(){
		return discountID;
	}

	public void setDiscountHappyHoursID(String discountHappyHoursID){
		this.discountHappyHoursID = discountHappyHoursID;
	}

	public String getDiscountHappyHoursID(){
		return discountHappyHoursID;
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

	public void setDayID(String dayID){
		this.dayID = dayID;
	}

	public String getDayID(){
		return dayID;
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
			"DiscountHappyHoursItem{" + 
			"createdBy = '" + createdBy + '\'' + 
			",endTime = '" + endTime + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",discountID = '" + discountID + '\'' + 
			",discountHappyHoursID = '" + discountHappyHoursID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",dayID = '" + dayID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}