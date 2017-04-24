package com.amos.employeedb.domain.model.member;

import java.util.List;

/**
 * Created by t1user on 25/4/17.
 */
public class MemberSkillCollection {
    private List<MemberSkill> memberSkillList;

    public MemberSkillCollection(List<MemberSkill> memberSkillList) {
        this.memberSkillList = memberSkillList;
    }

    public List<MemberSkill> getMemberSkillList() {
        return memberSkillList;
    }
}
