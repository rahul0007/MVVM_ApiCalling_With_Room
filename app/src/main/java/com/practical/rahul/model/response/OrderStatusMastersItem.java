package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OrderStatusMastersItem{

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("OrderStatusID")
	private String orderStatusID;

	@SerializedName("Name")
	private String name;

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setOrderStatusID(String orderStatusID){
		this.orderStatusID = orderStatusID;
	}

	public String getOrderStatusID(){
		return orderStatusID;
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
			"OrderStatusMastersItem{" + 
			"isActive = '" + isActive + '\'' + 
			",orderStatusID = '" + orderStatusID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}