package com.amos.employeedb.domain.model.allocation;

import com.amos.employeedb.domain.model.EntityIdentifier;

import java.util.Date;

/**
 * Created by t1user on 25/4/17.
 */
public class ProjectAllocation {
    private EntityIdentifier allocationId;
    private Date startDate;
    private Date endDate;
    private float allocationPercentage;
    private Project project;
}
