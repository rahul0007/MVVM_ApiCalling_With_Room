package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemTaxMappingsItem{

	@SerializedName("ITMID")
	private String iTMID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("TaxGroupID")
	private String taxGroupID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("ItemID")
	private String itemID;

	public void setITMID(String iTMID){
		this.iTMID = iTMID;
	}

	public String getITMID(){
		return iTMID;
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

	public void setItemID(String itemID){
		this.itemID = itemID;
	}

	public String getItemID(){
		return itemID;
	}

	@Override
 	public String toString(){
		return 
			"ItemTaxMappingsItem{" + 
			"iTMID = '" + iTMID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",taxGroupID = '" + taxGroupID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			"}";
		}
}