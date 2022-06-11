package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class PrinterMastersItem{

	@SerializedName("BrandName")
	private String brandName;

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("ModelName")
	private String modelName;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("PrinterID")
	private String printerID;

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setIsDeleted(String isDeleted){
		this.isDeleted = isDeleted;
	}

	public String getIsDeleted(){
		return isDeleted;
	}

	public void setModelName(String modelName){
		this.modelName = modelName;
	}

	public String getModelName(){
		return modelName;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setPrinterID(String printerID){
		this.printerID = printerID;
	}

	public String getPrinterID(){
		return printerID;
	}

	@Override
 	public String toString(){
		return 
			"PrinterMastersItem{" + 
			"brandName = '" + brandName + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",modelName = '" + modelName + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",printerID = '" + printerID + '\'' + 
			"}";
		}
}