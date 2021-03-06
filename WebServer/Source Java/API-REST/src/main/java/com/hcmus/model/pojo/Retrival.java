package com.hcmus.model.pojo;
// Generated Nov 29, 2016 3:35:54 PM by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Retrival generated by hbm2java
 */
public class Retrival implements java.io.Serializable {

	private String retrivalCode;
	private String accountNumber;
	private String merchantCode;
	private Merchant merchant;
	private String transactionCode;
	private Date transactionDate;
	private Date reportDate;
	private BigDecimal amout;
	private Card card;

	public Retrival() {
	}

	public Retrival(String retrivalCode, String accountNumber, Merchant merchant, String transactionCode, Date transactionDate,
			Date reportDate, BigDecimal amout, Card card) {
		this.retrivalCode = retrivalCode;
		this.accountNumber = accountNumber;
		this.merchant = merchant;
		this.transactionCode = transactionCode;
		this.transactionDate = transactionDate;
		this.reportDate = reportDate;
		this.amout = amout;
		this.card = card;
	}
	
	@JsonProperty("RetrivalCode")
	public String getRetrivalCode() {
		return this.retrivalCode;
	}

	public void setRetrivalCode(String retrivalCode) {
		this.retrivalCode = retrivalCode;
	}
	@JsonProperty("AccountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	@JsonProperty("Card")
	public Card getCard() {
		return this.card;
	}

	public void setCard(Card card) {
		this.card = ORMUtils.initializeAndUnproxy(card);
	}
	
	@JsonProperty("MerchantCode")
	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	
	
	@JsonProperty("Merchant")
	public Merchant getMerchant() {
		return this.merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = ORMUtils.initializeAndUnproxy(merchant);
	}

	@JsonProperty("TransactionCode")
	public String getTransactionCode() {
		return this.transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	@JsonProperty("TransactionDate")
	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@JsonProperty("ReportDate")
	public Date getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	@JsonProperty("Amout")
	public BigDecimal getAmout() {
		return this.amout;
	}

	public void setAmout(BigDecimal amout) {
		this.amout = amout;
	}

}
