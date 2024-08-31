package org.example.behavioral.chain.of.responsibility.design.handler;

import org.example.behavioral.chain.of.responsibility.design.manage.LeaveApplication;

// abstract handler
public abstract class Employee implements LeaveApprover {

    private String role;
    private LeaveApprover leaveApprover;

    public Employee(String role, LeaveApprover leaveApprover) {
        this.role = role;
        this.leaveApprover = leaveApprover;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if(!processRequest(leaveApplication) && leaveApprover != null){
            leaveApprover.processLeaveApplication(leaveApplication);
        }
    }

    protected abstract boolean processRequest(LeaveApplication leaveApplication);

    @Override
    public String getApproverRole() {
        return role;
    }
}
