package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ConcessionaireScreenSaverMappingsItem{

	@SerializedName("IsDeleted")
	private Object isDeleted;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ConcessionaireID")
	private String concessionaireID;

	@SerializedName("ScreenSaverID")
	private String screenSaverID;

	@SerializedName("CSMID")
	private String cSMID;

	@SerializedName("Name")
	private String name;

	public void setIsDeleted(Object isDeleted){
		this.isDeleted = isDeleted;
	}

	public Object getIsDeleted(){
		return isDeleted;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setConcessionaireID(String concessionaireID){
		this.concessionaireID = concessionaireID;
	}

	public String getConcessionaireID(){
		return concessionaireID;
	}

	public void setScreenSaverID(String screenSaverID){
		this.screenSaverID = screenSaverID;
	}

	public String getScreenSaverID(){
		return screenSaverID;
	}

	public void setCSMID(String cSMID){
		this.cSMID = cSMID;
	}

	public String getCSMID(){
		return cSMID;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"ConcessionaireScreenSaverMappingsItem{" + 
			"isDeleted = '" + isDeleted + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",concessionaireID = '" + concessionaireID + '\'' + 
			",screenSaverID = '" + screenSaverID + '\'' + 
			",cSMID = '" + cSMID + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}