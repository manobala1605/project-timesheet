package com.timesheet.Logic;

import java.util.Scanner;
import com.timesheet.DAO.TimesheetTaskDAO;
import com.timesheet.Model.TimesheetProjects;

public class InsertProject {
    public static void insertproject(){
        try (Scanner insert = new Scanner(System.in)) {
            System.out.println("enter your user id");
             String userId = insert.nextLine();
            
             System.out.println("enter project code:");
             String projectcode = insert.nextLine();
             
             System.out.println("enter project Name:");
             String projectName = insert.nextLine();
            
             System.out.println("enter project created date:");
             String projectCreated = insert.nextLine();
             
             System.out.println("enter total no of tasks:");
             String totalTasks = insert.nextLine();
            
             System.out.println("enter no of task completed:");
             String tasksCompleted = insert.nextLine();

             System.out.println("enter project status:");
             String status = insert.nextLine();
            
             System.out.println("enter project deadline:");
             String deadline = insert.nextLine();

             TimesheetProjects insertproject = new TimesheetProjects(userId,projectcode,projectName,projectCreated,status,totalTasks,tasksCompleted,deadline);
             System.err.println(insertproject);
             TimesheetTaskDAO.addProject(insertproject.userId,insertproject.projectcode,insertproject.projectName, insertproject.projectCreated, insertproject.status, insertproject.totalTasks, insertproject.tasksCompleted, insertproject.deadline, userId);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    
}
