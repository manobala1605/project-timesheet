package com.timesheet.testusers;

import java.util.Scanner;

import com.timesheet.DAO.LoginUserDAO;
import com.timesheet.Model.TimesheetUser;

public class LoginUser {
    public static void loginUser() throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("enter your mail id:");
            String emailID = sc.nextLine();
            System.err.println(" enter your password:");
            String password = sc.nextLine();
            TimesheetUser users2 = new TimesheetUser(emailID,password);
            LoginUserDAO.loginUser(users2.emailID,users2.password);
        }
    }
}
