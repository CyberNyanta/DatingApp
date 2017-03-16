package com.cybernyanta.dating.data.model.game;

import com.cybernyanta.dating.data.model.BaseEntity;

/**
 * Created by evgeniy.siyanko on 16.03.2017.
 */

public class Match extends BaseEntity {
    private String[] userIds;
    private String[] attitudeIds;
    private long timestamp;

    public String[] getAttitudeIds() {
        return attitudeIds;
    }

    public void setAttitudeIds(String[] attitudeIds) {
        this.attitudeIds = attitudeIds;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String[] getUserIds() {
        return userIds;
    }

    public void setUserIds(String[] userIds) {
        this.userIds = userIds;
    }
}
