package org.example.behavioral.chain.of.responsibility.design.handler;

import org.example.behavioral.chain.of.responsibility.design.manage.LeaveApplication;

public class Manager extends Employee {

    public Manager(LeaveApprover nextApprover) {
        super("Manager", nextApprover);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        switch (application.getType()) {
            case Sick:
                application.approve(getApproverRole());
                return true;
            case PTO:
                application.approve(getApproverRole());
                return true;

        }
        return false;
    }

}
