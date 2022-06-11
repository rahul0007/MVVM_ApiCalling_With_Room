package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class KitchenMastersItem{

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

	@SerializedName("IsDisplayGrillQueuePanel")
	private String isDisplayGrillQueuePanel;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("KitchenID")
	private String kitchenID;

	@SerializedName("Name")
	private String name;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("NameLang")
	private String nameLang;

	@SerializedName("KDSID")
	private String kDSID;

	@SerializedName("StaffModuleID")
	private String staffModuleID;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("DescriptionLang")
	private String descriptionLang;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("RoutingIPAddress")
	private String routingIPAddress;

	@SerializedName("KDSIPAddress")
	private String kDSIPAddress;

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

	public void setIsDisplayGrillQueuePanel(String isDisplayGrillQueuePanel){
		this.isDisplayGrillQueuePanel = isDisplayGrillQueuePanel;
	}

	public String getIsDisplayGrillQueuePanel(){
		return isDisplayGrillQueuePanel;
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

	public void setKitchenID(String kitchenID){
		this.kitchenID = kitchenID;
	}

	public String getKitchenID(){
		return kitchenID;
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

	public void setNameLang(String nameLang){
		this.nameLang = nameLang;
	}

	public String getNameLang(){
		return nameLang;
	}

	public void setKDSID(String kDSID){
		this.kDSID = kDSID;
	}

	public String getKDSID(){
		return kDSID;
	}

	public void setStaffModuleID(String staffModuleID){
		this.staffModuleID = staffModuleID;
	}

	public String getStaffModuleID(){
		return staffModuleID;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setDescriptionLang(String descriptionLang){
		this.descriptionLang = descriptionLang;
	}

	public String getDescriptionLang(){
		return descriptionLang;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setRoutingIPAddress(String routingIPAddress){
		this.routingIPAddress = routingIPAddress;
	}

	public String getRoutingIPAddress(){
		return routingIPAddress;
	}

	public void setKDSIPAddress(String kDSIPAddress){
		this.kDSIPAddress = kDSIPAddress;
	}

	public String getKDSIPAddress(){
		return kDSIPAddress;
	}

	@Override
 	public String toString(){
		return 
			"KitchenMastersItem{" + 
			"isDeleted = '" + isDeleted + '\'' + 
			",description = '" + description + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isDisplayGrillQueuePanel = '" + isDisplayGrillQueuePanel + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",kitchenID = '" + kitchenID + '\'' + 
			",name = '" + name + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",nameLang = '" + nameLang + '\'' + 
			",kDSID = '" + kDSID + '\'' + 
			",staffModuleID = '" + staffModuleID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",descriptionLang = '" + descriptionLang + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",routingIPAddress = '" + routingIPAddress + '\'' + 
			",kDSIPAddress = '" + kDSIPAddress + '\'' + 
			"}";
		}
}