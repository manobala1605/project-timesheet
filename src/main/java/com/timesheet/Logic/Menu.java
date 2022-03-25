package com.timesheet.Logic;

import java.util.Scanner;

import com.timesheet.DAO.TimesheetTaskDAO;
import com.timesheet.Model.TimesheetProjects;

public class Menu {
    public static void showMenu() throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. Insert project");
            System.out.println("2. Delete project");
            System.out.println("3. Update project");
            System.out.println("4. Display project");

            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    //Insert
                     InsertProject.insertproject();
                    break;
                case 2:
                    //Delete
                    DeleteProject.deleteproject();
                    break;
                case 3:
                    //Update
                   UpdateProject.updateproject();
                    break;
                   
                case 4:
                    // display
                    TimesheetTaskDAO.displayProject();
                    break;
                
                default:
                    System.out.println("Sorry wrong input, Please refresh the page");
                    System.exit(0);

            }
        }
    }
    
}
