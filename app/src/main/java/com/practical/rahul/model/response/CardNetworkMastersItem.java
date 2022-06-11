package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CardNetworkMastersItem{

	@SerializedName("NetworkName")
	private String networkName;

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("NetworkNameText")
	private String networkNameText;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("CardNetworkID")
	private String cardNetworkID;

	public void setNetworkName(String networkName){
		this.networkName = networkName;
	}

	public String getNetworkName(){
		return networkName;
	}

	public void setIsDeleted(String isDeleted){
		this.isDeleted = isDeleted;
	}

	public String getIsDeleted(){
		return isDeleted;
	}

	public void setNetworkNameText(String networkNameText){
		this.networkNameText = networkNameText;
	}

	public String getNetworkNameText(){
		return networkNameText;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setCardNetworkID(String cardNetworkID){
		this.cardNetworkID = cardNetworkID;
	}

	public String getCardNetworkID(){
		return cardNetworkID;
	}

	@Override
 	public String toString(){
		return 
			"CardNetworkMastersItem{" + 
			"networkName = '" + networkName + '\'' + 
			",isDeleted = '" + isDeleted + '\'' + 
			",networkNameText = '" + networkNameText + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",cardNetworkID = '" + cardNetworkID + '\'' + 
			"}";
		}
}