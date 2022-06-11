package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class PayTypeMastersItem{

	@SerializedName("PayTypeID")
	private String payTypeID;

	@SerializedName("Name")
	private String name;

	public void setPayTypeID(String payTypeID){
		this.payTypeID = payTypeID;
	}

	public String getPayTypeID(){
		return payTypeID;
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
			"PayTypeMastersItem{" + 
			"payTypeID = '" + payTypeID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}