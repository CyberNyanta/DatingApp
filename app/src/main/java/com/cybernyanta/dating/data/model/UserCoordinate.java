package com.cybernyanta.dating.data.model;

import com.cybernyanta.dating.data.model.BaseEntity;

/**
 * Created by yevhenii.siianko on 3/16/2017.
 */

public class UserCoordinate extends BaseEntity {
    private String userId;
    private long timeStamp;
    private Double latitude;
    private Double longitude;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
