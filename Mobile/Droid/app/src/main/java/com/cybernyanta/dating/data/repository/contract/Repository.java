package com.cybernyanta.dating.data.repository.contract;

import android.support.annotation.NonNull;

import com.cybernyanta.dating.data.model.BaseEntity;

/**
 * Created by yevhenii.siianko on 3/16/2017.
 */

public interface Repository<E extends BaseEntity> {
    E get(String id);

    boolean remove(String id);

    E add(E element);

    boolean update(E element);
}
