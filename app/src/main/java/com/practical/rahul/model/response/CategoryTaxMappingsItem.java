package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CategoryTaxMappingsItem{

	@SerializedName("CTMID")
	private String cTMID;

	@SerializedName("CategoryID")
	private String categoryID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("TaxGroupID")
	private String taxGroupID;

	@SerializedName("BranchID")
	private String branchID;

	public void setCTMID(String cTMID){
		this.cTMID = cTMID;
	}

	public String getCTMID(){
		return cTMID;
	}

	public void setCategoryID(String categoryID){
		this.categoryID = categoryID;
	}

	public String getCategoryID(){
		return categoryID;
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

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	@Override
 	public String toString(){
		return 
			"CategoryTaxMappingsItem{" + 
			"cTMID = '" + cTMID + '\'' + 
			",categoryID = '" + categoryID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",taxGroupID = '" + taxGroupID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			"}";
		}
}