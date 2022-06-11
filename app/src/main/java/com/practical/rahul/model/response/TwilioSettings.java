package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TwilioSettings{

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("TwilioAccountInfoID")
	private String twilioAccountInfoID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("AccountSid")
	private String accountSid;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("AuthToken")
	private String authToken;

	@SerializedName("PhoneNumber")
	private String phoneNumber;

	@SerializedName("IPAddress")
	private String iPAddress;

	public void setIsDeleted(String isDeleted){
		this.isDeleted = isDeleted;
	}

	public String getIsDeleted(){
		return isDeleted;
	}

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

	public void setTwilioAccountInfoID(String twilioAccountInfoID){
		this.twilioAccountInfoID = twilioAccountInfoID;
	}

	public String getTwilioAccountInfoID(){
		return twilioAccountInfoID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setAccountSid(String accountSid){
		this.accountSid = accountSid;
	}

	public String getAccountSid(){
		return accountSid;
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

	public void setAuthToken(String authToken){
		this.authToken = authToken;
	}

	public String getAuthToken(){
		return authToken;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
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
			"TwilioSettings{" + 
			"isDeleted = '" + isDeleted + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",twilioAccountInfoID = '" + twilioAccountInfoID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",accountSid = '" + accountSid + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",authToken = '" + authToken + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}