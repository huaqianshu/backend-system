package com.anycall.base.model.version;

import java.io.Serializable;


public class AppVersionModel implements Serializable {

	private boolean needUpdate;
	private String appUpgradeUrl;
	private String appVersion;

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppUpgradeUrl() {
		return appUpgradeUrl;
	}

	public void setAppUpgradeUrl(String appUpgradeUrl) {
		this.appUpgradeUrl = appUpgradeUrl;
	}

	public boolean isNeedUpdate() {
		return needUpdate;
	}

	public void setNeedUpdate(boolean needUpdate) {
		this.needUpdate = needUpdate;
	}

}
