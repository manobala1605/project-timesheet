package com.timesheet.testusers;

import java.util.Scanner;

import com.timesheet.DAO.RegisterDAO;
import com.timesheet.Model.TimesheetUser;

public class RegisterUser {
    public static void registerUser() throws Exception {
        try (Scanner ip = new Scanner(System.in)) {
            System.err.println("enter name , emailId ,password, project");
            String name = ip.nextLine();
            String emailID=ip.nextLine();
            String password=ip.nextLine();
            String project=ip.nextLine();
            TimesheetUser users = new TimesheetUser(name, emailID,password,project);
            System.err.println(users.name+"     "+users.emailID+"      "+users.password+"        "+users.project);
            RegisterDAO.addUser(users);
        }
        
    }

    
}
