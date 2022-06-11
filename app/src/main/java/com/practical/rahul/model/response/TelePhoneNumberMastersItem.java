package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TelePhoneNumberMastersItem{

	@SerializedName("IsDefault")
	private String isDefault;

	@SerializedName("TelePhoneNumberID")
	private String telePhoneNumberID;

	@SerializedName("TelePhoneNumberBreakUp")
	private String telePhoneNumberBreakUp;

	@SerializedName("TelePhoneNumberPrefix")
	private String telePhoneNumberPrefix;

	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}

	public String getIsDefault(){
		return isDefault;
	}

	public void setTelePhoneNumberID(String telePhoneNumberID){
		this.telePhoneNumberID = telePhoneNumberID;
	}

	public String getTelePhoneNumberID(){
		return telePhoneNumberID;
	}

	public void setTelePhoneNumberBreakUp(String telePhoneNumberBreakUp){
		this.telePhoneNumberBreakUp = telePhoneNumberBreakUp;
	}

	public String getTelePhoneNumberBreakUp(){
		return telePhoneNumberBreakUp;
	}

	public void setTelePhoneNumberPrefix(String telePhoneNumberPrefix){
		this.telePhoneNumberPrefix = telePhoneNumberPrefix;
	}

	public String getTelePhoneNumberPrefix(){
		return telePhoneNumberPrefix;
	}

	@Override
 	public String toString(){
		return 
			"TelePhoneNumberMastersItem{" + 
			"isDefault = '" + isDefault + '\'' + 
			",telePhoneNumberID = '" + telePhoneNumberID + '\'' + 
			",telePhoneNumberBreakUp = '" + telePhoneNumberBreakUp + '\'' + 
			",telePhoneNumberPrefix = '" + telePhoneNumberPrefix + '\'' + 
			"}";
		}
}