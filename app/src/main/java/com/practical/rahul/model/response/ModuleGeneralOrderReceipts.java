package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ModuleGeneralOrderReceipts{

	@SerializedName("ShowPointsEarned")
	private String showPointsEarned;

	@SerializedName("OrderImage")
	private String orderImage;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("ModuleGeneralSettingID")
	private String moduleGeneralSettingID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("HeaderText")
	private String headerText;

	@SerializedName("OrderReceiptID")
	private String orderReceiptID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("SecondaryText")
	private String secondaryText;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("MainText")
	private String mainText;

	public void setShowPointsEarned(String showPointsEarned){
		this.showPointsEarned = showPointsEarned;
	}

	public String getShowPointsEarned(){
		return showPointsEarned;
	}

	public void setOrderImage(String orderImage){
		this.orderImage = orderImage;
	}

	public String getOrderImage(){
		return orderImage;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setModuleGeneralSettingID(String moduleGeneralSettingID){
		this.moduleGeneralSettingID = moduleGeneralSettingID;
	}

	public String getModuleGeneralSettingID(){
		return moduleGeneralSettingID;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setHeaderText(String headerText){
		this.headerText = headerText;
	}

	public String getHeaderText(){
		return headerText;
	}

	public void setOrderReceiptID(String orderReceiptID){
		this.orderReceiptID = orderReceiptID;
	}

	public String getOrderReceiptID(){
		return orderReceiptID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setSecondaryText(String secondaryText){
		this.secondaryText = secondaryText;
	}

	public String getSecondaryText(){
		return secondaryText;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setMainText(String mainText){
		this.mainText = mainText;
	}

	public String getMainText(){
		return mainText;
	}

	@Override
 	public String toString(){
		return 
			"ModuleGeneralOrderReceipts{" + 
			"showPointsEarned = '" + showPointsEarned + '\'' + 
			",orderImage = '" + orderImage + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",moduleGeneralSettingID = '" + moduleGeneralSettingID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",headerText = '" + headerText + '\'' + 
			",orderReceiptID = '" + orderReceiptID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",secondaryText = '" + secondaryText + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",mainText = '" + mainText + '\'' + 
			"}";
		}
}