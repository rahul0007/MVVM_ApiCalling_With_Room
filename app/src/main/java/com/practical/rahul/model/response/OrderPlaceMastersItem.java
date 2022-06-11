package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OrderPlaceMastersItem{

	@SerializedName("PlaceName")
	private String placeName;

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("OrderPlaceID")
	private String orderPlaceID;

	@SerializedName("IsActive")
	private String isActive;

	public void setPlaceName(String placeName){
		this.placeName = placeName;
	}

	public String getPlaceName(){
		return placeName;
	}

	public void setIsDeleted(String isDeleted){
		this.isDeleted = isDeleted;
	}

	public String getIsDeleted(){
		return isDeleted;
	}

	public void setOrderPlaceID(String orderPlaceID){
		this.orderPlaceID = orderPlaceID;
	}

	public String getOrderPlaceID(){
		return orderPlaceID;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	@Override
 	public String toString(){
		return 
			"OrderPlaceMastersItem{" + 
			"placeName = '" + placeName + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",orderPlaceID = '" + orderPlaceID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			"}";
		}
}