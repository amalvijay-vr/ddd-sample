package com.amos.employeedb.infrastructure.persistence.allocation;

import com.amos.employeedb.domain.model.allocation.MemberAllocation;
import com.amos.employeedb.domain.model.allocation.MemberAllocationRepository;

/**
 * Created by t1user on 25/4/17.
 */
public class MemberAllocationRepositoryImpl implements MemberAllocationRepository {

    public void saveMemberAllocation(MemberAllocation memberAllocation) {
        /*
        * convert to JSON String
        * Save using spring jdbc template
        *
        * */
    }
}
