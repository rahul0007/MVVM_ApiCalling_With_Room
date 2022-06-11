package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class KDSMaxItemShowMappingsItem{

	@SerializedName("MaxNoOfItems")
	private String maxNoOfItems;

	@SerializedName("KDSID")
	private String kDSID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("KDSMaxItemID")
	private String kDSMaxItemID;

	@SerializedName("BranchID")
	private String branchID;

	public void setMaxNoOfItems(String maxNoOfItems){
		this.maxNoOfItems = maxNoOfItems;
	}

	public String getMaxNoOfItems(){
		return maxNoOfItems;
	}

	public void setKDSID(String kDSID){
		this.kDSID = kDSID;
	}

	public String getKDSID(){
		return kDSID;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setKDSMaxItemID(String kDSMaxItemID){
		this.kDSMaxItemID = kDSMaxItemID;
	}

	public String getKDSMaxItemID(){
		return kDSMaxItemID;
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
			"KDSMaxItemShowMappingsItem{" + 
			"maxNoOfItems = '" + maxNoOfItems + '\'' + 
			",kDSID = '" + kDSID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",kDSMaxItemID = '" + kDSMaxItemID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			"}";
		}
}