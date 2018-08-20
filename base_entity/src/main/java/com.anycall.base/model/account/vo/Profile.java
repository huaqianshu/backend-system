package com.anycall.base.model.account.vo;

import com.anycall.base.model.account.Member;

/**
 * Created by lujun on 16/6/8.
 * Copyright © 2014-2016 ants-city.com
 */
public class Profile extends Member {

    private static final long serialVersionUID = 3892705286835878553L;

    private String newPassword;

    private String newPasswordRetype;

    private String avatarImg;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPasswordRetype() {
        return newPasswordRetype;
    }

    public void setNewPasswordRetype(String newPasswordRetype) {
        this.newPasswordRetype = newPasswordRetype;
    }

    public String getAvatarImg() {
        return avatarImg;
    }

    public void setAvatarImg(String avatarImg) {
        this.avatarImg = avatarImg;
    }
}
