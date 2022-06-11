package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ReciptFormatMastersItem{

	@SerializedName("IsDefault")
	private String isDefault;

	@SerializedName("ReciptFormatID")
	private String reciptFormatID;

	@SerializedName("FileName")
	private String fileName;

	@SerializedName("ReciptFormatName")
	private String reciptFormatName;

	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}

	public String getIsDefault(){
		return isDefault;
	}

	public void setReciptFormatID(String reciptFormatID){
		this.reciptFormatID = reciptFormatID;
	}

	public String getReciptFormatID(){
		return reciptFormatID;
	}

	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	public String getFileName(){
		return fileName;
	}

	public void setReciptFormatName(String reciptFormatName){
		this.reciptFormatName = reciptFormatName;
	}

	public String getReciptFormatName(){
		return reciptFormatName;
	}

	@Override
 	public String toString(){
		return 
			"ReciptFormatMastersItem{" + 
			"isDefault = '" + isDefault + '\'' + 
			",reciptFormatID = '" + reciptFormatID + '\'' + 
			",fileName = '" + fileName + '\'' + 
			",reciptFormatName = '" + reciptFormatName + '\'' + 
			"}";
		}
}