package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class NotificationSettingsItem{

	@SerializedName("ModuleID")
	private String moduleID;

	@SerializedName("SMSText")
	private String sMSText;

	@SerializedName("NPMID")
	private String nPMID;

	@SerializedName("ModuleName")
	private String moduleName;

	@SerializedName("Title")
	private String title;

	@SerializedName("BranchIsSMS")
	private String branchIsSMS;

	@SerializedName("EmailText")
	private String emailText;

	@SerializedName("DelayTimeForKDS")
	private String delayTimeForKDS;

	@SerializedName("BranchIsEmail")
	private String branchIsEmail;

	public void setModuleID(String moduleID){
		this.moduleID = moduleID;
	}

	public String getModuleID(){
		return moduleID;
	}

	public void setSMSText(String sMSText){
		this.sMSText = sMSText;
	}

	public String getSMSText(){
		return sMSText;
	}

	public void setNPMID(String nPMID){
		this.nPMID = nPMID;
	}

	public String getNPMID(){
		return nPMID;
	}

	public void setModuleName(String moduleName){
		this.moduleName = moduleName;
	}

	public String getModuleName(){
		return moduleName;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setBranchIsSMS(String branchIsSMS){
		this.branchIsSMS = branchIsSMS;
	}

	public String getBranchIsSMS(){
		return branchIsSMS;
	}

	public void setEmailText(String emailText){
		this.emailText = emailText;
	}

	public String getEmailText(){
		return emailText;
	}

	public void setDelayTimeForKDS(String delayTimeForKDS){
		this.delayTimeForKDS = delayTimeForKDS;
	}

	public String getDelayTimeForKDS(){
		return delayTimeForKDS;
	}

	public void setBranchIsEmail(String branchIsEmail){
		this.branchIsEmail = branchIsEmail;
	}

	public String getBranchIsEmail(){
		return branchIsEmail;
	}

	@Override
 	public String toString(){
		return 
			"NotificationSettingsItem{" + 
			"moduleID = '" + moduleID + '\'' + 
			",sMSText = '" + sMSText + '\'' + 
			",nPMID = '" + nPMID + '\'' + 
			",moduleName = '" + moduleName + '\'' + 
			",title = '" + title + '\'' + 
			",branchIsSMS = '" + branchIsSMS + '\'' + 
			",emailText = '" + emailText + '\'' + 
			",delayTimeForKDS = '" + delayTimeForKDS + '\'' + 
			",branchIsEmail = '" + branchIsEmail + '\'' + 
			"}";
		}
}