package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemCategoryMappingsItem{

	@SerializedName("CategoryID")
	private String categoryID;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("PCMappingID")
	private String pCMappingID;

	@SerializedName("ItemID")
	private String itemID;

	public void setCategoryID(String categoryID){
		this.categoryID = categoryID;
	}

	public String getCategoryID(){
		return categoryID;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setPCMappingID(String pCMappingID){
		this.pCMappingID = pCMappingID;
	}

	public String getPCMappingID(){
		return pCMappingID;
	}

	public void setItemID(String itemID){
		this.itemID = itemID;
	}

	public String getItemID(){
		return itemID;
	}

	@Override
 	public String toString(){
		return 
			"ItemCategoryMappingsItem{" + 
			"categoryID = '" + categoryID + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",pCMappingID = '" + pCMappingID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			"}";
		}
}