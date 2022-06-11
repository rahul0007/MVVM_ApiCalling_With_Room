package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TaxMastersItem{

	@SerializedName("TaxNo")
	private String taxNo;

	@SerializedName("RefTaxId")
	private String refTaxId;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("Percentage")
	private String percentage;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("TaxName")
	private String taxName;

	@SerializedName("TaxID")
	private String taxID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("RefVersion")
	private String refVersion;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("ThirdPartyPortalID")
	private String thirdPartyPortalID;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("TaxNameLang")
	private String taxNameLang;

	@SerializedName("IPAddress")
	private String iPAddress;

	public void setTaxNo(String taxNo){
		this.taxNo = taxNo;
	}

	public String getTaxNo(){
		return taxNo;
	}

	public void setRefTaxId(String refTaxId){
		this.refTaxId = refTaxId;
	}

	public String getRefTaxId(){
		return refTaxId;
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

	public void setPercentage(String percentage){
		this.percentage = percentage;
	}

	public String getPercentage(){
		return percentage;
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

	public void setTaxName(String taxName){
		this.taxName = taxName;
	}

	public String getTaxName(){
		return taxName;
	}

	public void setTaxID(String taxID){
		this.taxID = taxID;
	}

	public String getTaxID(){
		return taxID;
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

	public void setTaxNameLang(String taxNameLang){
		this.taxNameLang = taxNameLang;
	}

	public String getTaxNameLang(){
		return taxNameLang;
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
			"TaxMastersItem{" + 
			"taxNo = '" + taxNo + '\'' + 
			",refTaxId = '" + refTaxId + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",percentage = '" + percentage + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",taxName = '" + taxName + '\'' + 
			",taxID = '" + taxID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",refVersion = '" + refVersion + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",thirdPartyPortalID = '" + thirdPartyPortalID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",taxNameLang = '" + taxNameLang + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}