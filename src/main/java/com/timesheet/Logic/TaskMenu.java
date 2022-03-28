package com.timesheet.Logic;

import java.util.Scanner;

import com.timesheet.DAO.TimesheetTaskDAO;

public class TaskMenu {
    public static void showTaskMenu() throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. Insert Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Update Task");
            System.out.println("4. Display Task");

            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    //Insert
                    InsertTask.insertTask();
                    break;
                case 2:
                    //Delete
                    DeleteTask.deleteTask();
                    break;
                case 3:
                    //Update
                   UpdateTask.updateTask();
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
