package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ModuleGeneralEmailReceiptSettings{

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("ModuleGeneralSettingID")
	private String moduleGeneralSettingID;

	@SerializedName("FinishText")
	private String finishText;

	@SerializedName("CompanyID")
	private String companyID;

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

	@SerializedName("EmailReceiptID")
	private String emailReceiptID;

	@SerializedName("EmailImage")
	private String emailImage;

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

	public void setEmailReceiptID(String emailReceiptID){
		this.emailReceiptID = emailReceiptID;
	}

	public String getEmailReceiptID(){
		return emailReceiptID;
	}

	public void setEmailImage(String emailImage){
		this.emailImage = emailImage;
	}

	public String getEmailImage(){
		return emailImage;
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
			"ModuleGeneralEmailReceiptSettings{" + 
			"createdBy = '" + createdBy + '\'' + 
			",moduleGeneralSettingID = '" + moduleGeneralSettingID + '\'' + 
			",finishText = '" + finishText + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",headerText = '" + headerText + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",secondaryText = '" + secondaryText + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",emailReceiptID = '" + emailReceiptID + '\'' + 
			",emailImage = '" + emailImage + '\'' + 
			",mainText = '" + mainText + '\'' + 
			"}";
		}
}