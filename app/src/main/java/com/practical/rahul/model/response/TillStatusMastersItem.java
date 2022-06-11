package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TillStatusMastersItem{

	@SerializedName("TillStatusID")
	private String tillStatusID;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("Name")
	private String name;

	public void setTillStatusID(String tillStatusID){
		this.tillStatusID = tillStatusID;
	}

	public String getTillStatusID(){
		return tillStatusID;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
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
			"TillStatusMastersItem{" + 
			"tillStatusID = '" + tillStatusID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}