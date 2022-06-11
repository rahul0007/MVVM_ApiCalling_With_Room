package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class DenominationMastersItem{

	@SerializedName("UpdatedBy")
	private String updatedBy;

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

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("DenominationID")
	private String denominationID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("DenominationName")
	private String denominationName;

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

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

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setDenominationID(String denominationID){
		this.denominationID = denominationID;
	}

	public String getDenominationID(){
		return denominationID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setDenominationName(String denominationName){
		this.denominationName = denominationName;
	}

	public String getDenominationName(){
		return denominationName;
	}

	@Override
 	public String toString(){
		return 
			"DenominationMastersItem{" + 
			"updatedBy = '" + updatedBy + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",denominationID = '" + denominationID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",denominationName = '" + denominationName + '\'' + 
			"}";
		}
}