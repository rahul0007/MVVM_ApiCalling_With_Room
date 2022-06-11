package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class PusherSettingMasters{

	@SerializedName("AppID")
	private String appID;

	@SerializedName("AppKey")
	private String appKey;

	@SerializedName("Cluster")
	private String cluster;

	@SerializedName("AppSecret")
	private String appSecret;

	@SerializedName("PusherSettingID")
	private String pusherSettingID;

	public void setAppID(String appID){
		this.appID = appID;
	}

	public String getAppID(){
		return appID;
	}

	public void setAppKey(String appKey){
		this.appKey = appKey;
	}

	public String getAppKey(){
		return appKey;
	}

	public void setCluster(String cluster){
		this.cluster = cluster;
	}

	public String getCluster(){
		return cluster;
	}

	public void setAppSecret(String appSecret){
		this.appSecret = appSecret;
	}

	public String getAppSecret(){
		return appSecret;
	}

	public void setPusherSettingID(String pusherSettingID){
		this.pusherSettingID = pusherSettingID;
	}

	public String getPusherSettingID(){
		return pusherSettingID;
	}

	@Override
 	public String toString(){
		return 
			"PusherSettingMasters{" + 
			"appID = '" + appID + '\'' + 
			",appKey = '" + appKey + '\'' + 
			",cluster = '" + cluster + '\'' + 
			",appSecret = '" + appSecret + '\'' + 
			",pusherSettingID = '" + pusherSettingID + '\'' + 
			"}";
		}
}