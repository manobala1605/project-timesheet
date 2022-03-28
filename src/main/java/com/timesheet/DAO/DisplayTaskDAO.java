package com.timesheet.DAO;

public class DisplayTaskDAO {

    public static void displayTask() throws Exception {
        String query = "SELECT * FROM timesheet_app_tasks;";
        TimesheetTaskDAO.runQuery(query);
    }

}
