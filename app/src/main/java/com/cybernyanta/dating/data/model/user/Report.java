package com.cybernyanta.dating.data.model.user;

import com.cybernyanta.dating.data.model.BaseEntity;

/**
 * Created by yevhenii.siianko on 3/16/2017.
 */

public class Report extends BaseEntity {
    public final int REPORT_TYPE_UNDEFINED = 0;
    public final int REPORT_TYPE_INAPPROPRIATE_PHOTO = 1;
    public final int REPORT_TYPE_INAPPROPRIATE_MESSAGES = 2;
    public final int REPORT_TYPE_SPAM = 3;
    public final int REPORT_TYPE_CLONE_OF_MY_ACCOUNT = 4;
    public final int REPORT_TYPE_MY_OLD_ACCOUNT = 5;

    private String userId;
    private String targetUserId;
    private int reportType;
    private String message;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReportType() {
        return reportType;
    }

    public void setReportType(int reportType) {
        this.reportType = reportType;
    }

    public String getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
    }
}
