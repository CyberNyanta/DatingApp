package com.cybernyanta.dating.data.model.user;

import com.cybernyanta.dating.data.model.BaseEntity;

/**
 * Created by yevhenii.siianko on 3/16/2017.
 */

public class User extends BaseEntity {
    public final int GENDER_UNDEFINED = 0;
    public final int GENDER_FEMALE = 1;
    public final int GENDER_MALE = 2;

    private String coordinateId;
    private String birthday;
    private String userName;
    private int gender;

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
