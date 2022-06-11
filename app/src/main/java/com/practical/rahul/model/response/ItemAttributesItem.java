package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemAttributesItem{

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("ItemID")
	private String itemID;

	@SerializedName("Name")
	private String name;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("ItemAttributeID")
	private String itemAttributeID;

	@SerializedName("NameLang")
	private String nameLang;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("DisplayName")
	private String displayName;

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

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setItemID(String itemID){
		this.itemID = itemID;
	}

	public String getItemID(){
		return itemID;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setItemAttributeID(String itemAttributeID){
		this.itemAttributeID = itemAttributeID;
	}

	public String getItemAttributeID(){
		return itemAttributeID;
	}

	public void setNameLang(String nameLang){
		this.nameLang = nameLang;
	}

	public String getNameLang(){
		return nameLang;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
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
			"ItemAttributesItem{" + 
			"createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			",name = '" + name + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",itemAttributeID = '" + itemAttributeID + '\'' + 
			",nameLang = '" + nameLang + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}