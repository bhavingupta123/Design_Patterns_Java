package org.example.behavioral.chain.of.responsibility.design.handler;


import org.example.behavioral.chain.of.responsibility.design.manage.LeaveApplication;

// handler in chain of responsibility
public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication leaveApplication); // called by client
    String getApproverRole();
}
