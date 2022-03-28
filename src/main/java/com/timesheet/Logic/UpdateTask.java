package com.timesheet.Logic;

import java.util.Scanner;

import com.timesheet.Model.TimesheetTasks;

public class UpdateTask {

    public static void updateTask() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.UPDATE TASK");
        System.out.println("2.UPDATE TASK STATUS");
        System.out.println("3.UPDATE TASK DEADLINE");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter the task no:");
                Long taskNo = sc.nextLong();
            
                System.out.println("enter the new task:");
                String newTask = sc.nextLine();

                TimesheetTasks updateTasks = new TimesheetTasks(taskNo,newTask);
                System.out.println(updateTasks);
                UpdateTaskDAO.UpdateTask(updateTasks);
                break;
            
            case 2:
                System.out.println("enter the task no:");
                Long taskNo1 = sc.nextLong();

                System.out.println("enter the task status:");
                String taskStatus = sc.nextLine();

                TimesheetTasks updateStatus = new TimesheetTasks(taskNo1,taskStatus);
                System.out.println(updateStatus);
                UpdateTaskDAO.UpdateStatus(updateStatus);

            case 3:
                System.out.println("enter the task no:");
                Long taskNo2 = sc.nextLong();

                System.out.println("enter the task status:");
                String taskDeadline = sc.nextLine();

                TimesheetTasks updateDeadline = new TimesheetTasks(taskNo2,taskDeadline);
                System.out.println(updateDeadline);
                UpdateTaskDAO.UpdateDeadline(updateDeadline);
            
            default:
                System.out.println("invalid input..!!!, enter 1/2/3");
                System.exit(0);
                break;
        }
        sc.close();
    }

}
