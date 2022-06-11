package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class RevenueCenterMastersItem{

	@SerializedName("RevenueCenterDescription")
	private String revenueCenterDescription;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("RevenueCenterID")
	private String revenueCenterID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("RevenueCenterName")
	private String revenueCenterName;

	public void setRevenueCenterDescription(String revenueCenterDescription){
		this.revenueCenterDescription = revenueCenterDescription;
	}

	public String getRevenueCenterDescription(){
		return revenueCenterDescription;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setRevenueCenterID(String revenueCenterID){
		this.revenueCenterID = revenueCenterID;
	}

	public String getRevenueCenterID(){
		return revenueCenterID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setRevenueCenterName(String revenueCenterName){
		this.revenueCenterName = revenueCenterName;
	}

	public String getRevenueCenterName(){
		return revenueCenterName;
	}

	@Override
 	public String toString(){
		return 
			"RevenueCenterMastersItem{" + 
			"revenueCenterDescription = '" + revenueCenterDescription + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",revenueCenterID = '" + revenueCenterID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",revenueCenterName = '" + revenueCenterName + '\'' + 
			"}";
		}
}