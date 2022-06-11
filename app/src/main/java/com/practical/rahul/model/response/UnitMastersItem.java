package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class UnitMastersItem{

	@SerializedName("IsDefault")
	private String isDefault;

	@SerializedName("UnitWeight")
	private String unitWeight;

	@SerializedName("UnitID")
	private String unitID;

	@SerializedName("UnitName")
	private String unitName;

	@SerializedName("UnitCapacity")
	private String unitCapacity;

	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}

	public String getIsDefault(){
		return isDefault;
	}

	public void setUnitWeight(String unitWeight){
		this.unitWeight = unitWeight;
	}

	public String getUnitWeight(){
		return unitWeight;
	}

	public void setUnitID(String unitID){
		this.unitID = unitID;
	}

	public String getUnitID(){
		return unitID;
	}

	public void setUnitName(String unitName){
		this.unitName = unitName;
	}

	public String getUnitName(){
		return unitName;
	}

	public void setUnitCapacity(String unitCapacity){
		this.unitCapacity = unitCapacity;
	}

	public String getUnitCapacity(){
		return unitCapacity;
	}

	@Override
 	public String toString(){
		return 
			"UnitMastersItem{" + 
			"isDefault = '" + isDefault + '\'' + 
			",unitWeight = '" + unitWeight + '\'' + 
			",unitID = '" + unitID + '\'' + 
			",unitName = '" + unitName + '\'' + 
			",unitCapacity = '" + unitCapacity + '\'' + 
			"}";
		}
}