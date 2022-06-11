package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ThirdPartyLoyaltyMastersItem{

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ThirdPartyLoyaltyID")
	private String thirdPartyLoyaltyID;

	@SerializedName("Name")
	private String name;

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setThirdPartyLoyaltyID(String thirdPartyLoyaltyID){
		this.thirdPartyLoyaltyID = thirdPartyLoyaltyID;
	}

	public String getThirdPartyLoyaltyID(){
		return thirdPartyLoyaltyID;
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
			"ThirdPartyLoyaltyMastersItem{" + 
			"isActive = '" + isActive + '\'' + 
			",thirdPartyLoyaltyID = '" + thirdPartyLoyaltyID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}