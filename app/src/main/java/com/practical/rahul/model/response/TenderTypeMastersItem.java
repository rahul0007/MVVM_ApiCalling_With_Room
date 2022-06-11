package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TenderTypeMastersItem{

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("TenderTypeID")
	private String tenderTypeID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("Name")
	private String name;

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setTenderTypeID(String tenderTypeID){
		this.tenderTypeID = tenderTypeID;
	}

	public String getTenderTypeID(){
		return tenderTypeID;
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

	@Override
 	public String toString(){
		return 
			"TenderTypeMastersItem{" + 
			"companyID = '" + companyID + '\'' + 
			",tenderTypeID = '" + tenderTypeID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}