package com.timesheet.Logic;

public class DisplayTask {

    public static void displayTask() throws Exception {
        System.out.println("DISPLAY ALL TASKS");
        DisplayTaskDAO.displayTask();
    }

}
