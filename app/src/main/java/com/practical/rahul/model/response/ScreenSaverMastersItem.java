package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ScreenSaverMastersItem{

	@SerializedName("Description")
	private String description;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("VideoPath")
	private String videoPath;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ConcessionaireID")
	private String concessionaireID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("SliderText")
	private String sliderText;

	@SerializedName("Name")
	private String name;

	@SerializedName("ScreenSaverTypeID")
	private String screenSaverTypeID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("ImagePath")
	private String imagePath;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("AnimationDirectionID")
	private String animationDirectionID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("ScreenSaverID")
	private String screenSaverID;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setVideoPath(String videoPath){
		this.videoPath = videoPath;
	}

	public String getVideoPath(){
		return videoPath;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setUpdatedDate(String updatedDate){
		this.updatedDate = updatedDate;
	}

	public String getUpdatedDate(){
		return updatedDate;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setConcessionaireID(String concessionaireID){
		this.concessionaireID = concessionaireID;
	}

	public String getConcessionaireID(){
		return concessionaireID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setSliderText(String sliderText){
		this.sliderText = sliderText;
	}

	public String getSliderText(){
		return sliderText;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setScreenSaverTypeID(String screenSaverTypeID){
		this.screenSaverTypeID = screenSaverTypeID;
	}

	public String getScreenSaverTypeID(){
		return screenSaverTypeID;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setImagePath(String imagePath){
		this.imagePath = imagePath;
	}

	public String getImagePath(){
		return imagePath;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setAnimationDirectionID(String animationDirectionID){
		this.animationDirectionID = animationDirectionID;
	}

	public String getAnimationDirectionID(){
		return animationDirectionID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setScreenSaverID(String screenSaverID){
		this.screenSaverID = screenSaverID;
	}

	public String getScreenSaverID(){
		return screenSaverID;
	}

	@Override
 	public String toString(){
		return 
			"ScreenSaverMastersItem{" + 
			"description = '" + description + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",videoPath = '" + videoPath + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",concessionaireID = '" + concessionaireID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",sliderText = '" + sliderText + '\'' + 
			",name = '" + name + '\'' + 
			",screenSaverTypeID = '" + screenSaverTypeID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",imagePath = '" + imagePath + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",animationDirectionID = '" + animationDirectionID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",screenSaverID = '" + screenSaverID + '\'' + 
			"}";
		}
}