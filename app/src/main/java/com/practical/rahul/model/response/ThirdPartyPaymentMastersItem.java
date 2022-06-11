package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ThirdPartyPaymentMastersItem{

	@SerializedName("ThirdPartyPaymentID")
	private String thirdPartyPaymentID;

	@SerializedName("PaymentTypeID")
	private String paymentTypeID;

	@SerializedName("Name")
	private String name;

	public void setThirdPartyPaymentID(String thirdPartyPaymentID){
		this.thirdPartyPaymentID = thirdPartyPaymentID;
	}

	public String getThirdPartyPaymentID(){
		return thirdPartyPaymentID;
	}

	public void setPaymentTypeID(String paymentTypeID){
		this.paymentTypeID = paymentTypeID;
	}

	public String getPaymentTypeID(){
		return paymentTypeID;
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
			"ThirdPartyPaymentMastersItem{" + 
			"thirdPartyPaymentID = '" + thirdPartyPaymentID + '\'' + 
			",paymentTypeID = '" + paymentTypeID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}