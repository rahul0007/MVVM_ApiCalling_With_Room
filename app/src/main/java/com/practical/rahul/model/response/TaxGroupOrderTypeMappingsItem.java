package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TaxGroupOrderTypeMappingsItem{

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("TaxGroupID")
	private String taxGroupID;

	@SerializedName("OrderTypeID")
	private String orderTypeID;

	@SerializedName("TGOTMappingID")
	private String tGOTMappingID;

	@SerializedName("BranchID")
	private String branchID;

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

	public void setOrderTypeID(String orderTypeID){
		this.orderTypeID = orderTypeID;
	}

	public String getOrderTypeID(){
		return orderTypeID;
	}

	public void setTGOTMappingID(String tGOTMappingID){
		this.tGOTMappingID = tGOTMappingID;
	}

	public String getTGOTMappingID(){
		return tGOTMappingID;
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
			"TaxGroupOrderTypeMappingsItem{" + 
			"companyID = '" + companyID + '\'' + 
			",taxGroupID = '" + taxGroupID + '\'' + 
			",orderTypeID = '" + orderTypeID + '\'' + 
			",tGOTMappingID = '" + tGOTMappingID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			"}";
		}
}