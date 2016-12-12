package com.hcmus.model.pojo;
// Generated Nov 29, 2016 3:35:54 PM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Agent generated by hbm2java
 */
@JsonInclude(Include.ALWAYS)
public class Agent implements java.io.Serializable {

	private String agentCode;
	private String cityCode;
	private String agentName;
	private Character agentStatus;
	private String owner;
	private String address1;
	private String address2;
	private String address3;
	private Integer zip;
	private String phone;
	private String fax;
	private String email;
	private Date approvalDate;
	private Date closeDate;
	private Date firstActiveDate;
	private Date lastActiveDate;
	private String cityName;
	private String regionCode;
	private String regionName;
	private City city;
	private Set<Merchant> merchants = new HashSet<Merchant>(0);

	public Agent() {
	}

	
	public Agent(String agentCode, String cityCode, String agentName, Character agentStatus, String owner,
			String address1, String address2, String address3, Integer zip, String phone, String fax,
			String email, Date approvalDate, Date closeDate, Date firstActiveDate, Date lastActiveDate,
			String cityName, String regionCode, String regionName, Set<Merchant> merchants) {
		this.agentCode = agentCode;
		this.cityCode = cityCode;
		this.agentName = agentName;
		this.agentStatus = agentStatus;
		this.owner = owner;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.zip = zip;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
		this.approvalDate = approvalDate;
		this.closeDate = closeDate;
		this.firstActiveDate = firstActiveDate;
		this.lastActiveDate = lastActiveDate;
		this.cityName = cityName;
		this.regionCode = regionCode;
		this.regionName = regionName;
		this.merchants = merchants;
	}
	@JsonProperty("AgentCode")
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	@JsonProperty("CityCode")
	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	@JsonProperty("AgentName")
	public String getAgentName() {
		return this.agentName;
	}
	
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	@JsonProperty("AgentStatus")
	public Character getAgentStatus() {
		return this.agentStatus;
	}

	public void setAgentStatus(Character agentStatus) {
		this.agentStatus = agentStatus;
	}
	@JsonProperty("Owner")
	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	@JsonProperty("Address1")
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	@JsonProperty("Address2")
	public String getAddress2() {
		return this.address2;
	}
	
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	@JsonProperty("Address3")
	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	@JsonProperty("Zip")
	public Integer getZip() {
		return this.zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}
	@JsonProperty("Phone")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	@JsonProperty("Fax")
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	@JsonProperty("Email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@JsonProperty("ApprovalDate")
	public Date getApprovalDate() {
		return this.approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}
	@JsonProperty("CloseDate")
	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	@JsonProperty("FristActiveDate")
	public Date getFirstActiveDate() {
		return this.firstActiveDate;
	}

	public void setFirstActiveDate(Date firstActiveDate) {
		this.firstActiveDate = firstActiveDate;
	}
	@JsonProperty("LastActiveDate")
	public Date getLastActiveDate() {
		return this.lastActiveDate;
	}

	public void setLastActiveDate(Date lastActiveDate) {
		this.lastActiveDate = lastActiveDate;
	}
	@JsonProperty("CityName")
	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@JsonProperty("RegionCode")
	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	@JsonProperty("RegionName")
	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	@JsonProperty("CITY")
	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = ORMUtils.initializeAndUnproxy(city);
	}
	@JsonProperty("MERCHANT")
	public Set<Merchant> getMerchants() {
		return this.merchants;
	}

	public void setMerchants(Set<Merchant> merchants) {
		this.merchants = ORMUtils.initializeAndUnproxy(merchants);
	}

}
