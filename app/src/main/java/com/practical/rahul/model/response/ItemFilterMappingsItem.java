package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemFilterMappingsItem{

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("PFMappingID")
	private String pFMappingID;

	@SerializedName("ItemID")
	private String itemID;

	@SerializedName("FilterID")
	private String filterID;

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setPFMappingID(String pFMappingID){
		this.pFMappingID = pFMappingID;
	}

	public String getPFMappingID(){
		return pFMappingID;
	}

	public void setItemID(String itemID){
		this.itemID = itemID;
	}

	public String getItemID(){
		return itemID;
	}

	public void setFilterID(String filterID){
		this.filterID = filterID;
	}

	public String getFilterID(){
		return filterID;
	}

	@Override
 	public String toString(){
		return 
			"ItemFilterMappingsItem{" + 
			"displayOrder = '" + displayOrder + '\'' + 
			",pFMappingID = '" + pFMappingID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			",filterID = '" + filterID + '\'' + 
			"}";
		}
}