package com.cybernyanta.dating.data.model;

import com.cybernyanta.dating.data.model.BaseEntity;

/**
 * Created by yevhenii.siianko on 3/16/2017.
 */

public class User extends BaseEntity {
    private String coordinateId;
    private String birthday;
    private String userName;

    public String getCoordinateId() {
        return coordinateId;
    }

    public void setCoordinateId(String coordinateId) {
        this.coordinateId = coordinateId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
