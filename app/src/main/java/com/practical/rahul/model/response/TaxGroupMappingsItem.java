package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TaxGroupMappingsItem{

	@SerializedName("TGMappingID")
	private String tGMappingID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("TaxGroupID")
	private String taxGroupID;

	@SerializedName("TaxID")
	private String taxID;

	@SerializedName("BranchID")
	private String branchID;

	public void setTGMappingID(String tGMappingID){
		this.tGMappingID = tGMappingID;
	}

	public String getTGMappingID(){
		return tGMappingID;
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

	@Override
 	public String toString(){
		return 
			"TaxGroupMappingsItem{" + 
			"tGMappingID = '" + tGMappingID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",taxGroupID = '" + taxGroupID + '\'' + 
			",taxID = '" + taxID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			"}";
		}
}