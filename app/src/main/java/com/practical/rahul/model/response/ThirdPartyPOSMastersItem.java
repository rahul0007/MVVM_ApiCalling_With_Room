package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ThirdPartyPOSMastersItem{

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ThirdPartyPOSID")
	private String thirdPartyPOSID;

	@SerializedName("Name")
	private String name;

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setThirdPartyPOSID(String thirdPartyPOSID){
		this.thirdPartyPOSID = thirdPartyPOSID;
	}

	public String getThirdPartyPOSID(){
		return thirdPartyPOSID;
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
			"ThirdPartyPOSMastersItem{" + 
			"isActive = '" + isActive + '\'' + 
			",thirdPartyPOSID = '" + thirdPartyPOSID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}