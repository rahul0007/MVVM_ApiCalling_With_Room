package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemImagesItem{

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("ImageUrl")
	private String imageUrl;

	@SerializedName("IImgID")
	private String iImgID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("ItemID")
	private String itemID;

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setIImgID(String iImgID){
		this.iImgID = iImgID;
	}

	public String getIImgID(){
		return iImgID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
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
			"ItemImagesItem{" + 
			"createdBy = '" + createdBy + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",iImgID = '" + iImgID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",itemID = '" + itemID + '\'' + 
			"}";
		}
}