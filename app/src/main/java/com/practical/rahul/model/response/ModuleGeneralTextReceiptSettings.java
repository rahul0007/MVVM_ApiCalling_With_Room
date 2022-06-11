package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ModuleGeneralTextReceiptSettings{

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("ModuleGeneralSettingID")
	private String moduleGeneralSettingID;

	@SerializedName("FinishText")
	private String finishText;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("TextReceiptID")
	private String textReceiptID;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("HeaderText")
	private String headerText;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("SecondaryText")
	private String secondaryText;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("MainText")
	private String mainText;

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

	public void setFinishText(String finishText){
		this.finishText = finishText;
	}

	public String getFinishText(){
		return finishText;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setTextReceiptID(String textReceiptID){
		this.textReceiptID = textReceiptID;
	}

	public String getTextReceiptID(){
		return textReceiptID;
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
			"ModuleGeneralTextReceiptSettings{" + 
			"createdBy = '" + createdBy + '\'' + 
			",moduleGeneralSettingID = '" + moduleGeneralSettingID + '\'' + 
			",finishText = '" + finishText + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",textReceiptID = '" + textReceiptID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",headerText = '" + headerText + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",secondaryText = '" + secondaryText + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",mainText = '" + mainText + '\'' + 
			"}";
		}
}