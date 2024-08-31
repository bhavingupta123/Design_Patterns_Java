package org.example.behavioral.chain.of.responsibility.design.handler;

import org.example.behavioral.chain.of.responsibility.design.manage.LeaveApplication;

// concrete handler

public class ProjectLead extends Employee{
    public ProjectLead(LeaveApprover leaveApprover) {
        super("Project Lead", leaveApprover);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {

        if(leaveApplication.getType() == LeaveApplication.Type.Sick){
            leaveApplication.approve(getApproverRole());
            return true;
        }

        return false;
    }
}
