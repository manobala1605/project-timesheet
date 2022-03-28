package com.timesheet.Logic;

import java.util.Scanner;

import com.timesheet.DAO.InsertTaskDAO;
import com.timesheet.Model.TimesheetTasks;

public class InsertTask {
    public static void insertTask() throws Exception {
        Scanner tasks = new Scanner(System.in);
        
        System.out.println("enter task no:");
        Long taskNo = tasks.nextLong();

        System.out.println("enter project code:");
        String projectCode = tasks.nextLine();

        System.out.println("enter the tasks:");
        String taskAssigned = tasks.nextLine();

        System.out.println("enter the task status:");
        String taskStatus = tasks.nextLine();

        System.out.println("enter the task duration");
        String duration = tasks.nextLine();

        System.out.println("enter the task deadline:");
        String taskDeadline = tasks.nextLine();

        TimesheetTasks timesheetTasks = new TimesheetTasks(taskNo, projectCode, taskAssigned, taskStatus, duration, taskDeadline);
        System.out.println(timesheetTasks);
        InsertTaskDAO.insertTask(timesheetTasks);

        tasks.close();
        
    }
    
}