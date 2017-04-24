package com.amos.employeedb.domain.model.allocation;

import com.amos.employeedb.domain.model.EntityIdentifier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by t1user on 25/4/17.
 */
public class MemberAllocation {
    private EntityIdentifier practiceMemberId;
    private List<ProjectAllocation> allocations;

    public MemberAllocation(EntityIdentifier practiceMemberId, ProjectAllocation projectAllocation) {
        this.practiceMemberId = practiceMemberId;
        this.allocations = new ArrayList<ProjectAllocation>();
        this.allocations.add(projectAllocation);
    }

    public EntityIdentifier getPracticeMemberId() {
        return practiceMemberId;
    }

    public List<ProjectAllocation> getAllocations() {
        return allocations;
    }
}
