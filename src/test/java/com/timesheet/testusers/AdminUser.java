package com.timesheet.testusers;

import java.util.Scanner;

import com.timesheet.DAO.AdminUserDAO;
import com.timesheet.DAO.UpdateUserDAO;

public class AdminUser {
    public static void adminUser(String newUserId, String userId) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
        String useremail1 = sc.nextLine();
        String userpassword1 = sc.nextLine();
                    
        if(useremail1.equals("manobala1605.adm@gmail.com")  && userpassword1.equals("mano.adm@123"))
        {
            System.err.println("welcome admin...!");
            System.err.println("1.DISPLAY USERS");
            System.err.println("2.UPDATE USERS");
            System.err.println("1.DELETE USERS");

            try (Scanner ip = new Scanner(System.in)) {
                int choice = ip.nextInt();

                switch(choice){
                    case 1:
                    AdminUserDAO.allUser();
                    break;

                    case 2:
                    Scanner mb = new Scanner(System.in);
                    int choose = mb.nextInt();
                    switch(choose){
                        case 1:
                        UpdateUserDAO.updateUserName(newUserId, userId);
                    }

                }
            }

            
        }
        else{
            System.err.println("you are not an admin...!!");
        }
        }
        
    }
    
}
