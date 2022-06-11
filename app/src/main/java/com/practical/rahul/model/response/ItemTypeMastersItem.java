package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemTypeMastersItem{

	@SerializedName("ItemTypeID")
	private String itemTypeID;

	@SerializedName("Name")
	private String name;

	public void setItemTypeID(String itemTypeID){
		this.itemTypeID = itemTypeID;
	}

	public String getItemTypeID(){
		return itemTypeID;
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
			"ItemTypeMastersItem{" + 
			"itemTypeID = '" + itemTypeID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}