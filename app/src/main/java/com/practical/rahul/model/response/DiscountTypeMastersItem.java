package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class DiscountTypeMastersItem{

	@SerializedName("DiscountTypeID")
	private String discountTypeID;

	@SerializedName("Name")
	private String name;

	public void setDiscountTypeID(String discountTypeID){
		this.discountTypeID = discountTypeID;
	}

	public String getDiscountTypeID(){
		return discountTypeID;
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
			"DiscountTypeMastersItem{" + 
			"discountTypeID = '" + discountTypeID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}