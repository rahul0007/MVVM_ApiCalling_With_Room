package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class PaymentTypeMastersItem{

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("PaymentTypeID")
	private String paymentTypeID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("Name")
	private String name;

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setUpdatedDate(String updatedDate){
		this.updatedDate = updatedDate;
	}

	public String getUpdatedDate(){
		return updatedDate;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setPaymentTypeID(String paymentTypeID){
		this.paymentTypeID = paymentTypeID;
	}

	public String getPaymentTypeID(){
		return paymentTypeID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
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
			"PaymentTypeMastersItem{" + 
			"updatedBy = '" + updatedBy + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",paymentTypeID = '" + paymentTypeID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}