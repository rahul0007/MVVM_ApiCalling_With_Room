package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class GrubbrrPayItem{

	@SerializedName("TPPaymentID")
	private String tPPaymentID;

	@SerializedName("ServiceCharge")
	private String serviceCharge;

	@SerializedName("DeviceID")
	private String deviceID;

	@SerializedName("AuthanticationKey")
	private String authanticationKey;

	@SerializedName("RegistrationID")
	private String registrationID;

	@SerializedName("PayboticDevjavooID")
	private String payboticDevjavooID;

	@SerializedName("TPNNumber")
	private String tPNNumber;

	public void setTPPaymentID(String tPPaymentID){
		this.tPPaymentID = tPPaymentID;
	}

	public String getTPPaymentID(){
		return tPPaymentID;
	}

	public void setServiceCharge(String serviceCharge){
		this.serviceCharge = serviceCharge;
	}

	public String getServiceCharge(){
		return serviceCharge;
	}

	public void setDeviceID(String deviceID){
		this.deviceID = deviceID;
	}

	public String getDeviceID(){
		return deviceID;
	}

	public void setAuthanticationKey(String authanticationKey){
		this.authanticationKey = authanticationKey;
	}

	public String getAuthanticationKey(){
		return authanticationKey;
	}

	public void setRegistrationID(String registrationID){
		this.registrationID = registrationID;
	}

	public String getRegistrationID(){
		return registrationID;
	}

	public void setPayboticDevjavooID(String payboticDevjavooID){
		this.payboticDevjavooID = payboticDevjavooID;
	}

	public String getPayboticDevjavooID(){
		return payboticDevjavooID;
	}

	public void setTPNNumber(String tPNNumber){
		this.tPNNumber = tPNNumber;
	}

	public String getTPNNumber(){
		return tPNNumber;
	}

	@Override
 	public String toString(){
		return 
			"GrubbrrPayItem{" + 
			"tPPaymentID = '" + tPPaymentID + '\'' + 
			",serviceCharge = '" + serviceCharge + '\'' + 
			",deviceID = '" + deviceID + '\'' + 
			",authanticationKey = '" + authanticationKey + '\'' + 
			",registrationID = '" + registrationID + '\'' + 
			",payboticDevjavooID = '" + payboticDevjavooID + '\'' + 
			",tPNNumber = '" + tPNNumber + '\'' + 
			"}";
		}
}