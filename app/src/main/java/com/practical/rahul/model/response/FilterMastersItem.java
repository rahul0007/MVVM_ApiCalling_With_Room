package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class FilterMastersItem{

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("Description")
	private String description;

	@SerializedName("DisplayOrder")
	private String displayOrder;

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

	@SerializedName("FilterID")
	private String filterID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("DisplayName")
	private String displayName;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("IconImage")
	private String iconImage;

	@SerializedName("RefFilterID")
	private String refFilterID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("FilterName")
	private String filterName;

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

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
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

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setFilterID(String filterID){
		this.filterID = filterID;
	}

	public String getFilterID(){
		return filterID;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setIconImage(String iconImage){
		this.iconImage = iconImage;
	}

	public String getIconImage(){
		return iconImage;
	}

	public void setRefFilterID(String refFilterID){
		this.refFilterID = refFilterID;
	}

	public String getRefFilterID(){
		return refFilterID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setFilterName(String filterName){
		this.filterName = filterName;
	}

	public String getFilterName(){
		return filterName;
	}

	@Override
 	public String toString(){
		return 
			"FilterMastersItem{" + 
			"isDeleted = '" + isDeleted + '\'' + 
			",description = '" + description + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",filterID = '" + filterID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",iconImage = '" + iconImage + '\'' + 
			",refFilterID = '" + refFilterID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",filterName = '" + filterName + '\'' + 
			"}";
		}
}