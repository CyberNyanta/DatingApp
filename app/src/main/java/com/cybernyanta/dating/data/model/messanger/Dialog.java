package com.cybernyanta.dating.data.model.messanger;

import com.cybernyanta.dating.data.model.BaseEntity;

/**
 * Created by yevhenii.siianko on 3/16/2017.
 */

public class Dialog extends BaseEntity {
    private String[] membersIds;
    private long updateDate;

    public Dialog(String[] membersIds, long updateDate) {
        this.membersIds = membersIds;
        this.updateDate = updateDate;
    }
}
