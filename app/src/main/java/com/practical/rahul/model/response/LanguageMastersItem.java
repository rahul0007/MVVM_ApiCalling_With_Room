package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class LanguageMastersItem{

	@SerializedName("IsDefault")
	private String isDefault;

	@SerializedName("LanguageCode")
	private String languageCode;

	@SerializedName("FileName")
	private String fileName;

	@SerializedName("DisplayName")
	private String displayName;

	@SerializedName("LanguageName")
	private String languageName;

	@SerializedName("LanguageID")
	private String languageID;

	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}

	public String getIsDefault(){
		return isDefault;
	}

	public void setLanguageCode(String languageCode){
		this.languageCode = languageCode;
	}

	public String getLanguageCode(){
		return languageCode;
	}

	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	public String getFileName(){
		return fileName;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setLanguageName(String languageName){
		this.languageName = languageName;
	}

	public String getLanguageName(){
		return languageName;
	}

	public void setLanguageID(String languageID){
		this.languageID = languageID;
	}

	public String getLanguageID(){
		return languageID;
	}

	@Override
 	public String toString(){
		return 
			"LanguageMastersItem{" + 
			"isDefault = '" + isDefault + '\'' + 
			",languageCode = '" + languageCode + '\'' + 
			",fileName = '" + fileName + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",languageName = '" + languageName + '\'' + 
			",languageID = '" + languageID + '\'' + 
			"}";
		}
}