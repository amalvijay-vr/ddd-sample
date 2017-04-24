package com.amos.employeedb.domain.model.member;

import com.amos.employeedb.domain.model.EntityIdentifier;

/**
 * Created by t1user on 25/4/17.
 */
public class MemberSkill {
    private EntityIdentifier memberSkillid;
    private int experienceInMonths;
    private boolean currentSkill;
    private boolean primarySkill;

    public MemberSkill(EntityIdentifier memberSkillid, int experienceInMonths, boolean currentSkill, boolean primarySkill) {
        this.memberSkillid = memberSkillid;
        this.experienceInMonths = experienceInMonths;
        this.currentSkill = currentSkill;
        this.primarySkill = primarySkill;
    }

    public EntityIdentifier getMemberSkillid() {
        return memberSkillid;
    }

    public int getExperienceInMonths() {
        return experienceInMonths;
    }

    public boolean isCurrentSkill() {
        return currentSkill;
    }

    public boolean isPrimarySkill() {
        return primarySkill;
    }
}
