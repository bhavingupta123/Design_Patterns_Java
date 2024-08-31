package org.example.behavioral.chain.of.responsibility.design;

import org.example.behavioral.chain.of.responsibility.design.handler.LeaveApprover;
import org.example.behavioral.chain.of.responsibility.design.handler.Manager;
import org.example.behavioral.chain.of.responsibility.design.handler.ProjectLead;
import org.example.behavioral.chain.of.responsibility.design.manage.LeaveApplication;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now()).to(LocalDate.of(2024, 11, 28))
                .build();

        LeaveApplication application2 = LeaveApplication.getBuilder().withType(LeaveApplication.Type.PTO)
                .from(LocalDate.now()).to(LocalDate.of(2024, 11, 28))
                .build();

        System.out.println(application);
        System.out.println("**************************************************");

        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);

        System.out.println("**************************************************");
        System.out.println("**************************************************");
        approver.processLeaveApplication(application2);
        System.out.println(application2);
    }

    private static LeaveApprover createChain() {
        Manager manager = new Manager(null);
        ProjectLead lead = new ProjectLead(manager);
        return lead;
    }
}
