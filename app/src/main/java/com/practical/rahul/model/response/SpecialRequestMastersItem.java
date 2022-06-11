package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class SpecialRequestMastersItem{

	@SerializedName("NoOfRequest")
	private String noOfRequest;

	@SerializedName("RequestText")
	private Object requestText;

	public void setNoOfRequest(String noOfRequest){
		this.noOfRequest = noOfRequest;
	}

	public String getNoOfRequest(){
		return noOfRequest;
	}

	public void setRequestText(Object requestText){
		this.requestText = requestText;
	}

	public Object getRequestText(){
		return requestText;
	}

	@Override
 	public String toString(){
		return 
			"SpecialRequestMastersItem{" + 
			"noOfRequest = '" + noOfRequest + '\'' + 
			",requestText = '" + requestText + '\'' + 
			"}";
		}
}