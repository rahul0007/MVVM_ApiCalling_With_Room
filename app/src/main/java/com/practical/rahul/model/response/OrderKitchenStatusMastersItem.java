package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OrderKitchenStatusMastersItem{

	@SerializedName("OrderKitchenStatusID")
	private String orderKitchenStatusID;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ColorCode")
	private String colorCode;

	@SerializedName("Name")
	private String name;

	public void setOrderKitchenStatusID(String orderKitchenStatusID){
		this.orderKitchenStatusID = orderKitchenStatusID;
	}

	public String getOrderKitchenStatusID(){
		return orderKitchenStatusID;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setColorCode(String colorCode){
		this.colorCode = colorCode;
	}

	public String getColorCode(){
		return colorCode;
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
			"OrderKitchenStatusMastersItem{" + 
			"orderKitchenStatusID = '" + orderKitchenStatusID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",colorCode = '" + colorCode + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}