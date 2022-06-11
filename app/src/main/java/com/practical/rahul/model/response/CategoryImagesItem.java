package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CategoryImagesItem{

	@SerializedName("CategoryID")
	private String categoryID;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("CImgID")
	private String cImgID;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("ImageUrl")
	private String imageUrl;

	@SerializedName("IPAddress")
	private String iPAddress;

	public void setCategoryID(String categoryID){
		this.categoryID = categoryID;
	}

	public String getCategoryID(){
		return categoryID;
	}

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

	public void setCImgID(String cImgID){
		this.cImgID = cImgID;
	}

	public String getCImgID(){
		return cImgID;
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

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	@Override
 	public String toString(){
		return 
			"CategoryImagesItem{" + 
			"categoryID = '" + categoryID + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",cImgID = '" + cImgID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}