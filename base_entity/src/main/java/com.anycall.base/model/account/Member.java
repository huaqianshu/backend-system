package com.anycall.base.model.account;
import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.Region;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Member extends AbstractPersistable {

	private static final long serialVersionUID = 2452531951175896854L;
	//邮箱
	private String email;

	private String loginName;

	//用户名
	private String realName;

	//手机号码
	private String mobileNo;

	//所属组织/公司
	private Long orgId;

	//所属部门/门店
	private String departmentCode;

	//
	private Long reporterId;
	//用户类型
	private MemberType memberType = MemberType.PLATFORM;

   //用户身份
	private IdentifyType identifyType = IdentifyType.NONE;

	//工人工资
	private Double workerWages;

	//工人是否兼职
	private Boolean isConcurrentPost=false;

	//如果工人兼职选择兼职的工作日
	private String parttimeDate;

	private String memberSkillName;

	private Region region;

	private String state;

	private String city;

	private String district;

	private Long stateId;

	private Long cityId;

	private Long districtId;

	//角色id ','分割
	private String roleIds;

	//密码加密后的Hash
	@JsonIgnore
	private String passwdHash;

	//是否启用
	private Boolean enabled = true;

	//Owner
	private Boolean isOwner = false;

	//管理员
//	@JsonProperty("isAdmin")
	private Boolean isAdmin = false;

	//是否已删除
	@JsonIgnore
	private boolean deleted = false;

	//语言类型
	private String locale;

	//失败登陆次数
	private Integer failedLogins;

	//是否鎖定
	private Boolean lock = false;

	//锁定截止时间
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
	private Date lockedOutUntil;

	//最后登陆时间
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
	private Date lastAccess;

	//密码重置令牌
	private String passwdResetToken;

//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
	private Date passwdResetTokenValidUntil;

	private Boolean activated = true;

	//用户激活令牌
	private String activeToken;

	//门店权限
	private String shopAuths;

	//创建人(更新人)
	private String creator;

	//创建时间
	private Date createTime;

	//更新时间
	private Date updateTime;

	//兼职开始时间
	@JsonFormat(pattern = "HH:mm:ss Z")
	private Date parttimeStardTime;

	//兼职结束时间
	@JsonFormat(pattern = "HH:mm:ss Z")
	private Date parttimeEndTime;
	//审批报价单
	private Boolean approveQuote;
	//审批结算单
	private Boolean approveSettlement;
	//分公司授权
	private Boolean companyAuth;
	//分公司Ids
	private String companyIds;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Long getReporterId() {
		return reporterId;
	}

	public void setReporterId(Long reporterId) {
		this.reporterId = reporterId;
	}

	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}

	public IdentifyType getIdentifyType() {
		return identifyType;
	}

	public void setIdentifyType(IdentifyType identifyType) {
		this.identifyType = identifyType;
	}

	public String getMemberSkillName() {
		return memberSkillName;
	}

	public void setMemberSkillName(String memberSkillName) {
		this.memberSkillName = memberSkillName;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public String getPasswdHash() {
		return passwdHash;
	}

	public void setPasswdHash(String passwdHash) {
		this.passwdHash = passwdHash;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getIsOwner() {
		return isOwner;
	}

	public void setIsOwner(Boolean owner) {
		isOwner = owner;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean admin) {
		isAdmin = admin;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Integer getFailedLogins() {
		return failedLogins;
	}

	public void setFailedLogins(Integer failedLogins) {
		this.failedLogins = failedLogins;
	}

	public Date getLockedOutUntil() {
		return lockedOutUntil;
	}

	public void setLockedOutUntil(Date lockedOutUntil) {
		this.lockedOutUntil = lockedOutUntil;
	}

	public Date getLastAccess() {
		return lastAccess;
	}

	public void setLastAccess(Date lastAccess) {
		this.lastAccess = lastAccess;
	}

	public String getPasswdResetToken() {
		return passwdResetToken;
	}

	public void setPasswdResetToken(String passwdResetToken) {
		this.passwdResetToken = passwdResetToken;
	}

	public Date getPasswdResetTokenValidUntil() {
		return passwdResetTokenValidUntil;
	}

	public void setPasswdResetTokenValidUntil(Date passwdResetTokenValidUntil) {
		this.passwdResetTokenValidUntil = passwdResetTokenValidUntil;
	}

	public Boolean getActivated() {
		return activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public String getActiveToken() {
		return activeToken;
	}

	public void setActiveToken(String activeToken) {
		this.activeToken = activeToken;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getOwner() {
		return isOwner;
	}

	public void setOwner(Boolean owner) {
		isOwner = owner;
	}

	public Boolean getAdmin() {
		return isAdmin;
	}

	public void setAdmin(Boolean admin) {
		isAdmin = admin;
	}

	public String getShopAuths() {
		return shopAuths;
	}

	public void setShopAuths(String shopAuths) {
		this.shopAuths = shopAuths;
	}

	public Double getWorkerWages() {
		return workerWages;
	}

	public void setWorkerWages(Double workerWages) {
		this.workerWages = workerWages;
	}

	public Boolean getIsConcurrentPost() {
		return isConcurrentPost;
	}

	public void setIsConcurrentPost(Boolean concurrentPost) {
		isConcurrentPost = concurrentPost;
	}

	public String getParttimeDate() {
		return parttimeDate;
	}

	public void setParttimeDate(String parttimeDate) {
		this.parttimeDate = parttimeDate;
	}

	public Boolean getLock() {
		return lock;
	}

	public void setLock(Boolean lock) {
		this.lock = lock;
	}

	public Date getParttimeStardTime() {
		return parttimeStardTime;
	}

	public void setParttimeStardTime(Date parttimeStardTime) {
		this.parttimeStardTime = parttimeStardTime;
	}

	public Date getParttimeEndTime() {
		return parttimeEndTime;
	}

	public void setParttimeEndTime(Date parttimeEndTime) {
		this.parttimeEndTime = parttimeEndTime;
	}

	public Boolean getApproveQuote() {
		return approveQuote;
	}

	public void setApproveQuote(Boolean approveQuote) {
		this.approveQuote = approveQuote;
	}

	public Boolean getApproveSettlement() {
		return approveSettlement;
	}

	public void setApproveSettlement(Boolean approveSettlement) {
		this.approveSettlement = approveSettlement;
	}

	public Boolean getCompanyAuth() {
		return companyAuth;
	}

	public void setCompanyAuth(Boolean companyAuth) {
		this.companyAuth = companyAuth;
	}

	public String getCompanyIds() {
		return companyIds;
	}

	public void setCompanyIds(String companyIds) {
		this.companyIds = companyIds;
	}
}
