package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class DiscountLimitationMastersItem{

	@SerializedName("DiscountLimitationID")
	private String discountLimitationID;

	@SerializedName("Name")
	private String name;

	public void setDiscountLimitationID(String discountLimitationID){
		this.discountLimitationID = discountLimitationID;
	}

	public String getDiscountLimitationID(){
		return discountLimitationID;
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
			"DiscountLimitationMastersItem{" + 
			"discountLimitationID = '" + discountLimitationID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}