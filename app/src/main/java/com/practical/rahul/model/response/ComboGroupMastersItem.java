package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ComboGroupMastersItem{

	@SerializedName("GroupName")
	private String groupName;

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

	@SerializedName("RefComboGroupID")
	private String refComboGroupID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("RefVersion")
	private String refVersion;

	@SerializedName("GroupNameLang")
	private String groupNameLang;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("ThirdPartyPortalID")
	private String thirdPartyPortalID;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("CountOption")
	private String countOption;

	@SerializedName("ComboGroupID")
	private String comboGroupID;

	@SerializedName("DescriptionLang")
	private String descriptionLang;

	@SerializedName("MinNoOfSelection")
	private String minNoOfSelection;

	@SerializedName("IPAddress")
	private String iPAddress;

	public void setGroupName(String groupName){
		this.groupName = groupName;
	}

	public String getGroupName(){
		return groupName;
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

	public void setRefComboGroupID(String refComboGroupID){
		this.refComboGroupID = refComboGroupID;
	}

	public String getRefComboGroupID(){
		return refComboGroupID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setRefVersion(String refVersion){
		this.refVersion = refVersion;
	}

	public String getRefVersion(){
		return refVersion;
	}

	public void setGroupNameLang(String groupNameLang){
		this.groupNameLang = groupNameLang;
	}

	public String getGroupNameLang(){
		return groupNameLang;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setThirdPartyPortalID(String thirdPartyPortalID){
		this.thirdPartyPortalID = thirdPartyPortalID;
	}

	public String getThirdPartyPortalID(){
		return thirdPartyPortalID;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setCountOption(String countOption){
		this.countOption = countOption;
	}

	public String getCountOption(){
		return countOption;
	}

	public void setComboGroupID(String comboGroupID){
		this.comboGroupID = comboGroupID;
	}

	public String getComboGroupID(){
		return comboGroupID;
	}

	public void setDescriptionLang(String descriptionLang){
		this.descriptionLang = descriptionLang;
	}

	public String getDescriptionLang(){
		return descriptionLang;
	}

	public void setMinNoOfSelection(String minNoOfSelection){
		this.minNoOfSelection = minNoOfSelection;
	}

	public String getMinNoOfSelection(){
		return minNoOfSelection;
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
			"ComboGroupMastersItem{" + 
			"groupName = '" + groupName + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",description = '" + description + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",refComboGroupID = '" + refComboGroupID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",refVersion = '" + refVersion + '\'' + 
			",groupNameLang = '" + groupNameLang + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",thirdPartyPortalID = '" + thirdPartyPortalID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",countOption = '" + countOption + '\'' + 
			",comboGroupID = '" + comboGroupID + '\'' + 
			",descriptionLang = '" + descriptionLang + '\'' + 
			",minNoOfSelection = '" + minNoOfSelection + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}