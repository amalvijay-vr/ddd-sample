package com.amos.employeedb.domain.model.member;

import com.amos.employeedb.domain.model.EntityIdentifier;
import com.amos.employeedb.domain.model.practice.Practice;

import java.util.List;

/**
 * Created by t1user on 25/4/17.
 */
public class PracticeMember {
    private EntityIdentifier practiceMemberId;
    private EntityIdentifier practiceId;
    private MemberSkillCollection skillCollection;

    public void addSkill(MemberSkill newSkill){
            this.skillCollection.getMemberSkillList().add(newSkill);
    }

    public void assignPractice(Practice practice) {
        this.practiceId = practice.getPracticeId();

    }
}
