package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class GratuityTaxGroupMappingItem{

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("ModuleGeneralSettingID")
	private String moduleGeneralSettingID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("TaxGroupID")
	private String taxGroupID;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("ModuleTaxMappingID")
	private String moduleTaxMappingID;

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setModuleGeneralSettingID(String moduleGeneralSettingID){
		this.moduleGeneralSettingID = moduleGeneralSettingID;
	}

	public String getModuleGeneralSettingID(){
		return moduleGeneralSettingID;
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

	public void setModuleTaxMappingID(String moduleTaxMappingID){
		this.moduleTaxMappingID = moduleTaxMappingID;
	}

	public String getModuleTaxMappingID(){
		return moduleTaxMappingID;
	}

	@Override
 	public String toString(){
		return 
			"GratuityTaxGroupMappingItem{" + 
			"createdBy = '" + createdBy + '\'' + 
			",moduleGeneralSettingID = '" + moduleGeneralSettingID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",taxGroupID = '" + taxGroupID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",moduleTaxMappingID = '" + moduleTaxMappingID + '\'' + 
			"}";
		}
}