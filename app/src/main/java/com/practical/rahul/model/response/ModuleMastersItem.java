package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ModuleMastersItem{

	@SerializedName("ModuleID")
	private String moduleID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("ModuleName")
	private String moduleName;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("IPAddress")
	private String iPAddress;

	public void setModuleID(String moduleID){
		this.moduleID = moduleID;
	}

	public String getModuleID(){
		return moduleID;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setUpdatedDate(String updatedDate){
		this.updatedDate = updatedDate;
	}

	public String getUpdatedDate(){
		return updatedDate;
	}

	public void setModuleName(String moduleName){
		this.moduleName = moduleName;
	}

	public String getModuleName(){
		return moduleName;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
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

	@Override
 	public String toString(){
		return 
			"ModuleMastersItem{" + 
			"moduleID = '" + moduleID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",moduleName = '" + moduleName + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}