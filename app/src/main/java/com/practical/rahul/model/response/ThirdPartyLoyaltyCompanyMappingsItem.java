package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ThirdPartyLoyaltyCompanyMappingsItem{

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("TPLMID")
	private String tPLMID;

	@SerializedName("ThirdPartyLoyaltyID")
	private String thirdPartyLoyaltyID;

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setTPLMID(String tPLMID){
		this.tPLMID = tPLMID;
	}

	public String getTPLMID(){
		return tPLMID;
	}

	public void setThirdPartyLoyaltyID(String thirdPartyLoyaltyID){
		this.thirdPartyLoyaltyID = thirdPartyLoyaltyID;
	}

	public String getThirdPartyLoyaltyID(){
		return thirdPartyLoyaltyID;
	}

	@Override
 	public String toString(){
		return 
			"ThirdPartyLoyaltyCompanyMappingsItem{" + 
			"companyID = '" + companyID + '\'' + 
			",tPLMID = '" + tPLMID + '\'' + 
			",thirdPartyLoyaltyID = '" + thirdPartyLoyaltyID + '\'' + 
			"}";
		}
}