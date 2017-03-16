package com.cybernyanta.dating.data.model;

/**
 * Created by yevhenii.siianko on 3/16/2017.
 */

public class Attitude {
    public final int UNDEFINED = 0;
    public final int LIKE = 1;
    public final int DISLIKE = 2;
    public final int SUPERLIKE = 3;

    private String userId;
    private String targerUserId;
    private long timestamp;


    public String getTargerUserId() {
        return targerUserId;
    }

    public void setTargerUserId(String targerUserId) {
        this.targerUserId = targerUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
