package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OrderEmailReceiptSetting{

	@SerializedName("EmailReceiptWebsite")
	private Object emailReceiptWebsite;

	@SerializedName("EmailReceiptHeaderColor")
	private Object emailReceiptHeaderColor;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("EmailReceiptSenderName")
	private Object emailReceiptSenderName;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("EmailReceiptPhoneNumber")
	private Object emailReceiptPhoneNumber;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("EmailReceiptButtonColor")
	private Object emailReceiptButtonColor;

	@SerializedName("EmailReceiptFooterText")
	private Object emailReceiptFooterText;

	@SerializedName("EmailReceiptHeaderText")
	private Object emailReceiptHeaderText;

	@SerializedName("EmailReceiptBoldColor")
	private Object emailReceiptBoldColor;

	@SerializedName("EmailReceiptSMSBody")
	private Object emailReceiptSMSBody;

	@SerializedName("EmailReceiptLogoPath")
	private Object emailReceiptLogoPath;

	@SerializedName("EmailReceiptButtonText")
	private Object emailReceiptButtonText;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("EmailReceiptID")
	private String emailReceiptID;

	public void setEmailReceiptWebsite(Object emailReceiptWebsite){
		this.emailReceiptWebsite = emailReceiptWebsite;
	}

	public Object getEmailReceiptWebsite(){
		return emailReceiptWebsite;
	}

	public void setEmailReceiptHeaderColor(Object emailReceiptHeaderColor){
		this.emailReceiptHeaderColor = emailReceiptHeaderColor;
	}

	public Object getEmailReceiptHeaderColor(){
		return emailReceiptHeaderColor;
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

	public void setEmailReceiptSenderName(Object emailReceiptSenderName){
		this.emailReceiptSenderName = emailReceiptSenderName;
	}

	public Object getEmailReceiptSenderName(){
		return emailReceiptSenderName;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setEmailReceiptPhoneNumber(Object emailReceiptPhoneNumber){
		this.emailReceiptPhoneNumber = emailReceiptPhoneNumber;
	}

	public Object getEmailReceiptPhoneNumber(){
		return emailReceiptPhoneNumber;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setEmailReceiptButtonColor(Object emailReceiptButtonColor){
		this.emailReceiptButtonColor = emailReceiptButtonColor;
	}

	public Object getEmailReceiptButtonColor(){
		return emailReceiptButtonColor;
	}

	public void setEmailReceiptFooterText(Object emailReceiptFooterText){
		this.emailReceiptFooterText = emailReceiptFooterText;
	}

	public Object getEmailReceiptFooterText(){
		return emailReceiptFooterText;
	}

	public void setEmailReceiptHeaderText(Object emailReceiptHeaderText){
		this.emailReceiptHeaderText = emailReceiptHeaderText;
	}

	public Object getEmailReceiptHeaderText(){
		return emailReceiptHeaderText;
	}

	public void setEmailReceiptBoldColor(Object emailReceiptBoldColor){
		this.emailReceiptBoldColor = emailReceiptBoldColor;
	}

	public Object getEmailReceiptBoldColor(){
		return emailReceiptBoldColor;
	}

	public void setEmailReceiptSMSBody(Object emailReceiptSMSBody){
		this.emailReceiptSMSBody = emailReceiptSMSBody;
	}

	public Object getEmailReceiptSMSBody(){
		return emailReceiptSMSBody;
	}

	public void setEmailReceiptLogoPath(Object emailReceiptLogoPath){
		this.emailReceiptLogoPath = emailReceiptLogoPath;
	}

	public Object getEmailReceiptLogoPath(){
		return emailReceiptLogoPath;
	}

	public void setEmailReceiptButtonText(Object emailReceiptButtonText){
		this.emailReceiptButtonText = emailReceiptButtonText;
	}

	public Object getEmailReceiptButtonText(){
		return emailReceiptButtonText;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
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

	@Override
 	public String toString(){
		return 
			"OrderEmailReceiptSetting{" + 
			"emailReceiptWebsite = '" + emailReceiptWebsite + '\'' + 
			",emailReceiptHeaderColor = '" + emailReceiptHeaderColor + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",emailReceiptSenderName = '" + emailReceiptSenderName + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",emailReceiptPhoneNumber = '" + emailReceiptPhoneNumber + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",emailReceiptButtonColor = '" + emailReceiptButtonColor + '\'' + 
			",emailReceiptFooterText = '" + emailReceiptFooterText + '\'' + 
			",emailReceiptHeaderText = '" + emailReceiptHeaderText + '\'' + 
			",emailReceiptBoldColor = '" + emailReceiptBoldColor + '\'' + 
			",emailReceiptSMSBody = '" + emailReceiptSMSBody + '\'' + 
			",emailReceiptLogoPath = '" + emailReceiptLogoPath + '\'' + 
			",emailReceiptButtonText = '" + emailReceiptButtonText + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",emailReceiptID = '" + emailReceiptID + '\'' + 
			"}";
		}
}