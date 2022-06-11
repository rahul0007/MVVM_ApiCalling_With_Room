package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OrderTypeMastersItem{

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("OrderTypeID")
	private String orderTypeID;

	@SerializedName("Name")
	private String name;

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setOrderTypeID(String orderTypeID){
		this.orderTypeID = orderTypeID;
	}

	public String getOrderTypeID(){
		return orderTypeID;
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
			"OrderTypeMastersItem{" + 
			"isActive = '" + isActive + '\'' + 
			",orderTypeID = '" + orderTypeID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}