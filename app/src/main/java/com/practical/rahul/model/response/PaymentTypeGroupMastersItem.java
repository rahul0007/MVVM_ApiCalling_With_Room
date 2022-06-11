package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class PaymentTypeGroupMastersItem{

	@SerializedName("PaymentTypeGroupID")
	private String paymentTypeGroupID;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("DisplayName")
	private String displayName;

	@SerializedName("Name")
	private String name;

	public void setPaymentTypeGroupID(String paymentTypeGroupID){
		this.paymentTypeGroupID = paymentTypeGroupID;
	}

	public String getPaymentTypeGroupID(){
		return paymentTypeGroupID;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
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
			"PaymentTypeGroupMastersItem{" + 
			"paymentTypeGroupID = '" + paymentTypeGroupID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}