package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;
import java.util.Date;

@JsonInclude(Include.NON_NULL)
public class PersistentLogin extends AbstractPersistable implements Serializable{

	private static final long serialVersionUID = -1375890892292054948L;

	private String series;

	@JsonIgnore
	private String token;

//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
	private Date lastUsed;

	//IP地址
	private String ipAddress;

	//使用的浏览器
	@JsonIgnore
	private String memberAgent;

	//登陆用户的ID
	private Long memberId;

	//非数据库字段
	private String userAgentName;

	//非数据库字段
	private String userAgentVersion;

	//非数据库字段
	private String operatingSystem;

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getLastUsed() {
		return this.lastUsed;
	}

	public void setLastUsed(Date lastUsed) {
		this.lastUsed = lastUsed;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getMemberAgent() {
		return memberAgent;
	}

	public void setMemberAgent(String memberAgent) {
		this.memberAgent = memberAgent;
	}

	public String getUserAgentName() {
		return userAgentName;
	}

	public void setUserAgentName(String userAgentName) {
		this.userAgentName = userAgentName;
	}

	public String getUserAgentVersion() {
		return userAgentVersion;
	}

	public void setUserAgentVersion(String userAgentVersion) {
		this.userAgentVersion = userAgentVersion;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
}