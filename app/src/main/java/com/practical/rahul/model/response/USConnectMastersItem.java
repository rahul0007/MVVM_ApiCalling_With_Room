package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class USConnectMastersItem{

	@SerializedName("UCMID")
	private String uCMID;

	@SerializedName("AuthToken")
	private String authToken;

	@SerializedName("DeviceSerialNumber")
	private String deviceSerialNumber;

	@SerializedName("URL")
	private String uRL;

	public void setUCMID(String uCMID){
		this.uCMID = uCMID;
	}

	public String getUCMID(){
		return uCMID;
	}

	public void setAuthToken(String authToken){
		this.authToken = authToken;
	}

	public String getAuthToken(){
		return authToken;
	}

	public void setDeviceSerialNumber(String deviceSerialNumber){
		this.deviceSerialNumber = deviceSerialNumber;
	}

	public String getDeviceSerialNumber(){
		return deviceSerialNumber;
	}

	public void setURL(String uRL){
		this.uRL = uRL;
	}

	public String getURL(){
		return uRL;
	}

	@Override
 	public String toString(){
		return 
			"USConnectMastersItem{" + 
			"uCMID = '" + uCMID + '\'' + 
			",authToken = '" + authToken + '\'' + 
			",deviceSerialNumber = '" + deviceSerialNumber + '\'' + 
			",uRL = '" + uRL + '\'' + 
			"}";
		}
}