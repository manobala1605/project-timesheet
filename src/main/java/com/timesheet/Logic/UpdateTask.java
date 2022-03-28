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
                System.out.println("enter the new task:");
                String newTask = sc.nextLine();

                System.out.println("enter the task no:");
                Long taskNo = sc.nextLong();

                TimesheetTasks updateTasks = new TimesheetTasks(taskNo,newTask);
                System.out.println(updateTasks);
                UpdateTaskDAO.UpdateTask(updateTasks);
                break;
        
            default:
                break;
        }
    }

}
