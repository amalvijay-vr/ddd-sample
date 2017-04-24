package com.amos.employeedb.domain.model.practice;

import com.amos.employeedb.domain.model.EntityIdentifier;

/**
 * Created by t1user on 25/4/17.
 */
public class Practice {
    private EntityIdentifier practiceId;

    public Practice(EntityIdentifier practiceId) {
        this.practiceId = practiceId;
    }

    public EntityIdentifier getPracticeId() {
        return practiceId;
    }
}
