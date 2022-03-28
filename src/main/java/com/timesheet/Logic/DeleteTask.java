package com.timesheet.Logic;

import java.util.Scanner;

import com.timesheet.Model.TimesheetTasks;

public class DeleteTask {

    public static void deleteTask() throws Exception {
        Scanner del = new Scanner(System.in);

        System.out.println("enter the task no:");
        long taskNo = del.nextLong();

        TimesheetTasks deleteTask = new TimesheetTasks(taskNo);
        System.out.println(deleteTask);
        DeleteTaskDAO.deleteTask(deleteTask);

        del.close();
    }

}
