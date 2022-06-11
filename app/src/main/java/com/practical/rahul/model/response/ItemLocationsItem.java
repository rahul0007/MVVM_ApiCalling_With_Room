package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemLocationsItem{

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("Description")
	private String description;

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

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("ItemLocationID")
	private String itemLocationID;

	@SerializedName("Name")
	private String name;

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

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
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

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setItemLocationID(String itemLocationID){
		this.itemLocationID = itemLocationID;
	}

	public String getItemLocationID(){
		return itemLocationID;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"ItemLocationsItem{" + 
			"updatedBy = '" + updatedBy + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",description = '" + description + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",itemLocationID = '" + itemLocationID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}