package com.timesheet.Logic;

import java.util.Scanner;
import com.timesheet.DAO.TimesheetTaskDAO;
import com.timesheet.Model.TimesheetProjects;

public class UpdateProject {
    public static void updateproject() throws Exception {
        try (Scanner update = new Scanner(System.in)) {
            System.out.println("1.update project name");
            System.out.println("2.update project status");
            System.out.println("3.update total number of tasks completed");
            System.out.println("4.update project deadline");

            int change = update.nextInt();

            switch(change){
                case 1:
                    System.out.println("enter user id:");
                    String userId1 = update.nextLine();
                    
                    System.out.println("enter project Name:");
                    String projectName1 = update.nextLine();
                    
                    TimesheetProjects updateprojectname = new TimesheetProjects(userId1,projectName1);
                    System.err.println(updateprojectname);
                    TimesheetTaskDAO.updateProjectName(projectName1,userId1);
                    break;
                case 2:
                    System.out.println("enter user id:");
                    String userId2 = update.nextLine();
                    
                    System.out.println("enter project status:");
                    String status1 = update.nextLine();
                    
                    TimesheetProjects updateprojectstatus = new TimesheetProjects(userId2,status1);
                    System.err.println(updateprojectstatus);
                    TimesheetTaskDAO.updateProjectStatus(status1, userId2);
                    break;
                case 3:
                    System.out.println("enter user id:");
                    String userId3 = update.nextLine();

                    System.out.println("enter no of task completed:");
                    String tasksCompleted1 = update.nextLine();
                    
                    TimesheetProjects updateTaskCompleted = new TimesheetProjects(userId3,tasksCompleted1);
                    System.err.println(updateTaskCompleted);
                    TimesheetTaskDAO.updateProjectTaskCompleted(tasksCompleted1, userId3);
                    break;
                case 4:
                    System.out.println("enter user id:");
                    String userId4 = update.nextLine();

                    System.out.println("enter project deadline:");
                    String deadline1 = update.nextLine();
                    
                    TimesheetProjects updateProjectDeadline = new TimesheetProjects(userId4,deadline1);
                    System.err.println(updateProjectDeadline);
                    TimesheetTaskDAO.updateProjectDeadline(deadline1, userId4);
                    break;
                default:
                    System.out.println("invalid input, choose correct input");
            }
        }
                    
                  /*  System.out.println("enter project code:");
                    String projectcode1 = update.nextLine();
                    System.out.println("enter project created date:");
                    String projectCreated1 = update.nextLine();
                    
                    System.out.println("enter total no of tasks:");
                    String totalTasks1 = update.nextLine();*/
        
    }
    
}
