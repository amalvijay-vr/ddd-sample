package com.amos.employeedb.interfaces;


import com.amos.employeedb.interfaces.entities.Member;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by t1user on 25/4/17.
 */
@WebService
public class MemberResource {
    @WebMethod(operationName = "/member/add")
    public void addMember(Member member){


    }

}
