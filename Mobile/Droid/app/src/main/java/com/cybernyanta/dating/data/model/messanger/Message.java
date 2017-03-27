package com.cybernyanta.dating.data.model.messanger;

import com.cybernyanta.dating.data.model.BaseEntity;

/**
 * Created by yevhenii.siianko on 3/16/2017.
 */

public class Message extends BaseEntity {
    private String dialogId;
    private String senderId;
    private String message;

    public Message(String dialogId, String senderId) {
        this.dialogId = dialogId;
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
