package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ScannerMastersItem{

	@SerializedName("ModelNumber")
	private String modelNumber;

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ScannerName")
	private String scannerName;

	@SerializedName("ScannerID")
	private String scannerID;

	public void setModelNumber(String modelNumber){
		this.modelNumber = modelNumber;
	}

	public String getModelNumber(){
		return modelNumber;
	}

	public void setIsDeleted(String isDeleted){
		this.isDeleted = isDeleted;
	}

	public String getIsDeleted(){
		return isDeleted;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setScannerName(String scannerName){
		this.scannerName = scannerName;
	}

	public String getScannerName(){
		return scannerName;
	}

	public void setScannerID(String scannerID){
		this.scannerID = scannerID;
	}

	public String getScannerID(){
		return scannerID;
	}

	@Override
 	public String toString(){
		return 
			"ScannerMastersItem{" + 
			"modelNumber = '" + modelNumber + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",scannerName = '" + scannerName + '\'' + 
			",scannerID = '" + scannerID + '\'' + 
			"}";
		}
}