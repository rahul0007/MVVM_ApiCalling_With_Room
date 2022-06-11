package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TipMastersItem{

	@SerializedName("IsDefault")
	private String isDefault;

	@SerializedName("IsPercentage")
	private String isPercentage;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("TipID")
	private String tipID;

	@SerializedName("PercentageOrAmount")
	private String percentageOrAmount;

	@SerializedName("BranchID")
	private String branchID;

	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}

	public String getIsDefault(){
		return isDefault;
	}

	public void setIsPercentage(String isPercentage){
		this.isPercentage = isPercentage;
	}

	public String getIsPercentage(){
		return isPercentage;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setTipID(String tipID){
		this.tipID = tipID;
	}

	public String getTipID(){
		return tipID;
	}

	public void setPercentageOrAmount(String percentageOrAmount){
		this.percentageOrAmount = percentageOrAmount;
	}

	public String getPercentageOrAmount(){
		return percentageOrAmount;
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
			"TipMastersItem{" + 
			"isDefault = '" + isDefault + '\'' + 
			",isPercentage = '" + isPercentage + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",tipID = '" + tipID + '\'' + 
			",percentageOrAmount = '" + percentageOrAmount + '\'' + 
			",branchID = '" + branchID + '\'' + 
			"}";
		}
}