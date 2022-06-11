package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CustomZReportSettingsItem{

	@SerializedName("CustomSectionName")
	private String customSectionName;

	@SerializedName("CSID")
	private String cSID;

	@SerializedName("CustomSectionSeqNo")
	private String customSectionSeqNo;

	@SerializedName("CustomSectionVisible")
	private String customSectionVisible;

	@SerializedName("CustomSectionId")
	private String customSectionId;

	public void setCustomSectionName(String customSectionName){
		this.customSectionName = customSectionName;
	}

	public String getCustomSectionName(){
		return customSectionName;
	}

	public void setCSID(String cSID){
		this.cSID = cSID;
	}

	public String getCSID(){
		return cSID;
	}

	public void setCustomSectionSeqNo(String customSectionSeqNo){
		this.customSectionSeqNo = customSectionSeqNo;
	}

	public String getCustomSectionSeqNo(){
		return customSectionSeqNo;
	}

	public void setCustomSectionVisible(String customSectionVisible){
		this.customSectionVisible = customSectionVisible;
	}

	public String getCustomSectionVisible(){
		return customSectionVisible;
	}

	public void setCustomSectionId(String customSectionId){
		this.customSectionId = customSectionId;
	}

	public String getCustomSectionId(){
		return customSectionId;
	}

	@Override
 	public String toString(){
		return 
			"CustomZReportSettingsItem{" + 
			"customSectionName = '" + customSectionName + '\'' + 
			",cSID = '" + cSID + '\'' + 
			",customSectionSeqNo = '" + customSectionSeqNo + '\'' + 
			",customSectionVisible = '" + customSectionVisible + '\'' + 
			",customSectionId = '" + customSectionId + '\'' + 
			"}";
		}
}