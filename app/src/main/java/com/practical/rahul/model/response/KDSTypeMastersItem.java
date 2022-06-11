package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class KDSTypeMastersItem{

	@SerializedName("KDSTypeID")
	private String kDSTypeID;

	@SerializedName("Name")
	private String name;

	public void setKDSTypeID(String kDSTypeID){
		this.kDSTypeID = kDSTypeID;
	}

	public String getKDSTypeID(){
		return kDSTypeID;
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
			"KDSTypeMastersItem{" + 
			"kDSTypeID = '" + kDSTypeID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}