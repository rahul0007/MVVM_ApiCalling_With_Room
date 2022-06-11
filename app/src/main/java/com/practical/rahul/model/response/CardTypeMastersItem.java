package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CardTypeMastersItem{

	@SerializedName("TypeName")
	private String typeName;

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("CardTypeID")
	private String cardTypeID;

	@SerializedName("IsActive")
	private String isActive;

	public void setTypeName(String typeName){
		this.typeName = typeName;
	}

	public String getTypeName(){
		return typeName;
	}

	public void setIsDeleted(String isDeleted){
		this.isDeleted = isDeleted;
	}

	public String getIsDeleted(){
		return isDeleted;
	}

	public void setCardTypeID(String cardTypeID){
		this.cardTypeID = cardTypeID;
	}

	public String getCardTypeID(){
		return cardTypeID;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	@Override
 	public String toString(){
		return 
			"CardTypeMastersItem{" + 
			"typeName = '" + typeName + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",cardTypeID = '" + cardTypeID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			"}";
		}
}