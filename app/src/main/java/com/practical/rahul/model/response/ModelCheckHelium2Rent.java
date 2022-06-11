package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ModelCheckHelium2Rent{

	@SerializedName("IsHelium2Rent")
	private boolean isHelium2Rent;

	public void setIsHelium2Rent(boolean isHelium2Rent){
		this.isHelium2Rent = isHelium2Rent;
	}

	public boolean isIsHelium2Rent(){
		return isHelium2Rent;
	}

	@Override
 	public String toString(){
		return 
			"ModelCheckHelium2Rent{" + 
			"isHelium2Rent = '" + isHelium2Rent + '\'' + 
			"}";
		}
}