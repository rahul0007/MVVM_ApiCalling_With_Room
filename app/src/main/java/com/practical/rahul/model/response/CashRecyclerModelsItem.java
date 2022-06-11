package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CashRecyclerModelsItem{

	@SerializedName("ThirdPartyPaymentID")
	private String thirdPartyPaymentID;

	@SerializedName("ModelName")
	private String modelName;

	@SerializedName("CashRecyclerModelID")
	private String cashRecyclerModelID;

	public void setThirdPartyPaymentID(String thirdPartyPaymentID){
		this.thirdPartyPaymentID = thirdPartyPaymentID;
	}

	public String getThirdPartyPaymentID(){
		return thirdPartyPaymentID;
	}

	public void setModelName(String modelName){
		this.modelName = modelName;
	}

	public String getModelName(){
		return modelName;
	}

	public void setCashRecyclerModelID(String cashRecyclerModelID){
		this.cashRecyclerModelID = cashRecyclerModelID;
	}

	public String getCashRecyclerModelID(){
		return cashRecyclerModelID;
	}

	@Override
 	public String toString(){
		return 
			"CashRecyclerModelsItem{" + 
			"thirdPartyPaymentID = '" + thirdPartyPaymentID + '\'' + 
			",modelName = '" + modelName + '\'' + 
			",cashRecyclerModelID = '" + cashRecyclerModelID + '\'' + 
			"}";
		}
}