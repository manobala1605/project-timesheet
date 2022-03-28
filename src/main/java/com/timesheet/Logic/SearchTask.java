package com.timesheet.Logic;

import java.util.Scanner;

import com.timesheet.Model.TimesheetTasks;

public class SearchTask {

    public static void SearchTasks() throws Exception {
        System.out.println("SEARCH TASKS");
        Scanner search = new Scanner(System.in);

        System.out.println("enter the task no");
        long taskNo = search.nextLong();

        TimesheetTasks searchTask = new TimesheetTasks(taskNo);
        SearchTaskDAO.searchTask(searchTask);

        search.close();
    }

}
