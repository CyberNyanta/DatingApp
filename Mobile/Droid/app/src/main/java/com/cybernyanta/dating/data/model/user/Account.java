package com.cybernyanta.dating.data.model.user;

import com.cybernyanta.dating.data.model.BaseEntity;

/**
 * Created by yevhenii.siianko on 3/16/2017.
 */

public class Account extends BaseEntity {
    public final int AUTH_TYPE_UNDEFINED = 0;
    public final int AUTH_TYPE_SOCIAL = 1;
    public final int AUTH_TYPE_CUSTOM = 2;
    public final int SOCIAL_AUTH_TYPE_UNDEFINED = 0;
    public final int SOCIAL_AUTH_TYPE_FACEBOOK = 1;
    public final int SOCIAL_AUTH_TYPE_VK = 2;

    private String userId;
    private String userName;
    private String password;
    private int[] authTypes;
    private long lastCheckeDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int[] getAuthTypes() {
        return authTypes;
    }

    public void setAuthTypes(int[] authTypes) {
        this.authTypes = authTypes;
    }

    public long getLastCheckeDate() {
        return lastCheckeDate;
    }

    public void setLastCheckeDate(long lastCheckeDate) {
        this.lastCheckeDate = lastCheckeDate;
    }
}
