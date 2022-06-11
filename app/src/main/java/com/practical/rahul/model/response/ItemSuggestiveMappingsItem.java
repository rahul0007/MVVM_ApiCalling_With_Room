package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemSuggestiveMappingsItem{

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("PSMappingID")
	private String pSMappingID;

	@SerializedName("SuggestiveItemID")
	private String suggestiveItemID;

	@SerializedName("ItemID")
	private String itemID;

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setPSMappingID(String pSMappingID){
		this.pSMappingID = pSMappingID;
	}

	public String getPSMappingID(){
		return pSMappingID;
	}

	public void setSuggestiveItemID(String suggestiveItemID){
		this.suggestiveItemID = suggestiveItemID;
	}

	public String getSuggestiveItemID(){
		return suggestiveItemID;
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
			"ItemSuggestiveMappingsItem{" + 
			"displayOrder = '" + displayOrder + '\'' + 
			",pSMappingID = '" + pSMappingID + '\'' + 
			",suggestiveItemID = '" + suggestiveItemID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			"}";
		}
}