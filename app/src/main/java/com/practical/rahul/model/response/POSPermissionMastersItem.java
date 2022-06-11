package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class POSPermissionMastersItem{

	@SerializedName("ParentID")
	private String parentID;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("POSPermissionID")
	private String pOSPermissionID;

	@SerializedName("Name")
	private String name;

	public void setParentID(String parentID){
		this.parentID = parentID;
	}

	public String getParentID(){
		return parentID;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setPOSPermissionID(String pOSPermissionID){
		this.pOSPermissionID = pOSPermissionID;
	}

	public String getPOSPermissionID(){
		return pOSPermissionID;
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
			"POSPermissionMastersItem{" + 
			"parentID = '" + parentID + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",pOSPermissionID = '" + pOSPermissionID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}