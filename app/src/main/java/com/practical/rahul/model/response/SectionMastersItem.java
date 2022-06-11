package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class SectionMastersItem{

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

	@SerializedName("TaxGroupID")
	private String taxGroupID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("Name")
	private String name;

	@SerializedName("IsDefaultSectionPOSTables")
	private String isDefaultSectionPOSTables;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("NameLang")
	private String nameLang;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("DescriptionLang")
	private String descriptionLang;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("SectionID")
	private String sectionID;

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

	public void setTaxGroupID(String taxGroupID){
		this.taxGroupID = taxGroupID;
	}

	public String getTaxGroupID(){
		return taxGroupID;
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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setIsDefaultSectionPOSTables(String isDefaultSectionPOSTables){
		this.isDefaultSectionPOSTables = isDefaultSectionPOSTables;
	}

	public String getIsDefaultSectionPOSTables(){
		return isDefaultSectionPOSTables;
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

	public void setSectionID(String sectionID){
		this.sectionID = sectionID;
	}

	public String getSectionID(){
		return sectionID;
	}

	@Override
 	public String toString(){
		return 
			"SectionMastersItem{" + 
			"isDeleted = '" + isDeleted + '\'' + 
			",description = '" + description + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",taxGroupID = '" + taxGroupID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",name = '" + name + '\'' + 
			",isDefaultSectionPOSTables = '" + isDefaultSectionPOSTables + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",nameLang = '" + nameLang + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",descriptionLang = '" + descriptionLang + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",sectionID = '" + sectionID + '\'' + 
			"}";
		}
}