package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class SystemConfigurationMasters{

	@SerializedName("PrimaryFileURL")
	private String primaryFileURL;

	@SerializedName("PrimaryWebURL")
	private String primaryWebURL;

	@SerializedName("SecondaryFileURL")
	private String secondaryFileURL;

	@SerializedName("SecondaryWebURL")
	private String secondaryWebURL;

	@SerializedName("PrimaryAPIURL")
	private String primaryAPIURL;

	@SerializedName("PrimaryImageURL")
	private String primaryImageURL;

	@SerializedName("SecondaryAPIURL")
	private String secondaryAPIURL;

	@SerializedName("SecondaryImageURL")
	private String secondaryImageURL;

	public void setPrimaryFileURL(String primaryFileURL){
		this.primaryFileURL = primaryFileURL;
	}

	public String getPrimaryFileURL(){
		return primaryFileURL;
	}

	public void setPrimaryWebURL(String primaryWebURL){
		this.primaryWebURL = primaryWebURL;
	}

	public String getPrimaryWebURL(){
		return primaryWebURL;
	}

	public void setSecondaryFileURL(String secondaryFileURL){
		this.secondaryFileURL = secondaryFileURL;
	}

	public String getSecondaryFileURL(){
		return secondaryFileURL;
	}

	public void setSecondaryWebURL(String secondaryWebURL){
		this.secondaryWebURL = secondaryWebURL;
	}

	public String getSecondaryWebURL(){
		return secondaryWebURL;
	}

	public void setPrimaryAPIURL(String primaryAPIURL){
		this.primaryAPIURL = primaryAPIURL;
	}

	public String getPrimaryAPIURL(){
		return primaryAPIURL;
	}

	public void setPrimaryImageURL(String primaryImageURL){
		this.primaryImageURL = primaryImageURL;
	}

	public String getPrimaryImageURL(){
		return primaryImageURL;
	}

	public void setSecondaryAPIURL(String secondaryAPIURL){
		this.secondaryAPIURL = secondaryAPIURL;
	}

	public String getSecondaryAPIURL(){
		return secondaryAPIURL;
	}

	public void setSecondaryImageURL(String secondaryImageURL){
		this.secondaryImageURL = secondaryImageURL;
	}

	public String getSecondaryImageURL(){
		return secondaryImageURL;
	}

	@Override
 	public String toString(){
		return 
			"SystemConfigurationMasters{" + 
			"primaryFileURL = '" + primaryFileURL + '\'' + 
			",primaryWebURL = '" + primaryWebURL + '\'' + 
			",secondaryFileURL = '" + secondaryFileURL + '\'' + 
			",secondaryWebURL = '" + secondaryWebURL + '\'' + 
			",primaryAPIURL = '" + primaryAPIURL + '\'' + 
			",primaryImageURL = '" + primaryImageURL + '\'' + 
			",secondaryAPIURL = '" + secondaryAPIURL + '\'' + 
			",secondaryImageURL = '" + secondaryImageURL + '\'' + 
			"}";
		}
}