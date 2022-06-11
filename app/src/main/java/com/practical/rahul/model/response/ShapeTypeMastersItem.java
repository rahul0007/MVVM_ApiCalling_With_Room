package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ShapeTypeMastersItem{

	@SerializedName("ShapeTypeID")
	private String shapeTypeID;

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("Name")
	private String name;

	public void setShapeTypeID(String shapeTypeID){
		this.shapeTypeID = shapeTypeID;
	}

	public String getShapeTypeID(){
		return shapeTypeID;
	}

	public void setIsDeleted(String isDeleted){
		this.isDeleted = isDeleted;
	}

	public String getIsDeleted(){
		return isDeleted;
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
			"ShapeTypeMastersItem{" + 
			"shapeTypeID = '" + shapeTypeID + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}