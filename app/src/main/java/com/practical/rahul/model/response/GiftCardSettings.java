package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class GiftCardSettings{

	@SerializedName("NewGCMessageHeader")
	private String newGCMessageHeader;

	@SerializedName("CustomGCMessageContent")
	private String customGCMessageContent;

	@SerializedName("RechargeGCShowCustomMessage")
	private String rechargeGCShowCustomMessage;

	@SerializedName("IsAllowReloadingofGiftCard")
	private String isAllowReloadingofGiftCard;

	@SerializedName("ShowCustomAmount")
	private String showCustomAmount;

	@SerializedName("CompletingPaymentContent")
	private String completingPaymentContent;

	@SerializedName("NewGCMessageContent")
	private String newGCMessageContent;

	@SerializedName("CompletingPaymentHeader")
	private String completingPaymentHeader;

	@SerializedName("RechargeGCImage")
	private String rechargeGCImage;

	@SerializedName("CustomGCMessageHeader")
	private String customGCMessageHeader;

	@SerializedName("NewGCShowCustomMessage")
	private String newGCShowCustomMessage;

	@SerializedName("RechargeGCMessageContent")
	private String rechargeGCMessageContent;

	@SerializedName("RechargeGCMessageHeader")
	private String rechargeGCMessageHeader;

	@SerializedName("CustomGCImage")
	private String customGCImage;

	public void setNewGCMessageHeader(String newGCMessageHeader){
		this.newGCMessageHeader = newGCMessageHeader;
	}

	public String getNewGCMessageHeader(){
		return newGCMessageHeader;
	}

	public void setCustomGCMessageContent(String customGCMessageContent){
		this.customGCMessageContent = customGCMessageContent;
	}

	public String getCustomGCMessageContent(){
		return customGCMessageContent;
	}

	public void setRechargeGCShowCustomMessage(String rechargeGCShowCustomMessage){
		this.rechargeGCShowCustomMessage = rechargeGCShowCustomMessage;
	}

	public String getRechargeGCShowCustomMessage(){
		return rechargeGCShowCustomMessage;
	}

	public void setIsAllowReloadingofGiftCard(String isAllowReloadingofGiftCard){
		this.isAllowReloadingofGiftCard = isAllowReloadingofGiftCard;
	}

	public String getIsAllowReloadingofGiftCard(){
		return isAllowReloadingofGiftCard;
	}

	public void setShowCustomAmount(String showCustomAmount){
		this.showCustomAmount = showCustomAmount;
	}

	public String getShowCustomAmount(){
		return showCustomAmount;
	}

	public void setCompletingPaymentContent(String completingPaymentContent){
		this.completingPaymentContent = completingPaymentContent;
	}

	public String getCompletingPaymentContent(){
		return completingPaymentContent;
	}

	public void setNewGCMessageContent(String newGCMessageContent){
		this.newGCMessageContent = newGCMessageContent;
	}

	public String getNewGCMessageContent(){
		return newGCMessageContent;
	}

	public void setCompletingPaymentHeader(String completingPaymentHeader){
		this.completingPaymentHeader = completingPaymentHeader;
	}

	public String getCompletingPaymentHeader(){
		return completingPaymentHeader;
	}

	public void setRechargeGCImage(String rechargeGCImage){
		this.rechargeGCImage = rechargeGCImage;
	}

	public String getRechargeGCImage(){
		return rechargeGCImage;
	}

	public void setCustomGCMessageHeader(String customGCMessageHeader){
		this.customGCMessageHeader = customGCMessageHeader;
	}

	public String getCustomGCMessageHeader(){
		return customGCMessageHeader;
	}

	public void setNewGCShowCustomMessage(String newGCShowCustomMessage){
		this.newGCShowCustomMessage = newGCShowCustomMessage;
	}

	public String getNewGCShowCustomMessage(){
		return newGCShowCustomMessage;
	}

	public void setRechargeGCMessageContent(String rechargeGCMessageContent){
		this.rechargeGCMessageContent = rechargeGCMessageContent;
	}

	public String getRechargeGCMessageContent(){
		return rechargeGCMessageContent;
	}

	public void setRechargeGCMessageHeader(String rechargeGCMessageHeader){
		this.rechargeGCMessageHeader = rechargeGCMessageHeader;
	}

	public String getRechargeGCMessageHeader(){
		return rechargeGCMessageHeader;
	}

	public void setCustomGCImage(String customGCImage){
		this.customGCImage = customGCImage;
	}

	public String getCustomGCImage(){
		return customGCImage;
	}

	@Override
 	public String toString(){
		return 
			"GiftCardSettings{" + 
			"newGCMessageHeader = '" + newGCMessageHeader + '\'' + 
			",customGCMessageContent = '" + customGCMessageContent + '\'' + 
			",rechargeGCShowCustomMessage = '" + rechargeGCShowCustomMessage + '\'' + 
			",isAllowReloadingofGiftCard = '" + isAllowReloadingofGiftCard + '\'' + 
			",showCustomAmount = '" + showCustomAmount + '\'' + 
			",completingPaymentContent = '" + completingPaymentContent + '\'' + 
			",newGCMessageContent = '" + newGCMessageContent + '\'' + 
			",completingPaymentHeader = '" + completingPaymentHeader + '\'' + 
			",rechargeGCImage = '" + rechargeGCImage + '\'' + 
			",customGCMessageHeader = '" + customGCMessageHeader + '\'' + 
			",newGCShowCustomMessage = '" + newGCShowCustomMessage + '\'' + 
			",rechargeGCMessageContent = '" + rechargeGCMessageContent + '\'' + 
			",rechargeGCMessageHeader = '" + rechargeGCMessageHeader + '\'' + 
			",customGCImage = '" + customGCImage + '\'' + 
			"}";
		}
}