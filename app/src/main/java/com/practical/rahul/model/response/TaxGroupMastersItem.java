package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TaxGroupMastersItem{

	@SerializedName("IsDefaultTaxGroup")
	private String isDefaultTaxGroup;

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

	@SerializedName("RefVersion")
	private String refVersion;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("TaxGroupNameLang")
	private String taxGroupNameLang;

	@SerializedName("RefTaxGroupId")
	private String refTaxGroupId;

	@SerializedName("TaxGroupName")
	private String taxGroupName;

	@SerializedName("ThirdPartyPortalID")
	private String thirdPartyPortalID;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("IPAddress")
	private String iPAddress;

	public void setIsDefaultTaxGroup(String isDefaultTaxGroup){
		this.isDefaultTaxGroup = isDefaultTaxGroup;
	}

	public String getIsDefaultTaxGroup(){
		return isDefaultTaxGroup;
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

	public void setRefVersion(String refVersion){
		this.refVersion = refVersion;
	}

	public String getRefVersion(){
		return refVersion;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setTaxGroupNameLang(String taxGroupNameLang){
		this.taxGroupNameLang = taxGroupNameLang;
	}

	public String getTaxGroupNameLang(){
		return taxGroupNameLang;
	}

	public void setRefTaxGroupId(String refTaxGroupId){
		this.refTaxGroupId = refTaxGroupId;
	}

	public String getRefTaxGroupId(){
		return refTaxGroupId;
	}

	public void setTaxGroupName(String taxGroupName){
		this.taxGroupName = taxGroupName;
	}

	public String getTaxGroupName(){
		return taxGroupName;
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

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	@Override
 	public String toString(){
		return 
			"TaxGroupMastersItem{" + 
			"isDefaultTaxGroup = '" + isDefaultTaxGroup + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",taxGroupID = '" + taxGroupID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",refVersion = '" + refVersion + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",taxGroupNameLang = '" + taxGroupNameLang + '\'' + 
			",refTaxGroupId = '" + refTaxGroupId + '\'' + 
			",taxGroupName = '" + taxGroupName + '\'' + 
			",thirdPartyPortalID = '" + thirdPartyPortalID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}