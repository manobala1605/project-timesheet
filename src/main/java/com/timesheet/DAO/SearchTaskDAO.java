package com.timesheet.DAO;

import com.timesheet.Model.TimesheetTasks;

public class SearchTaskDAO {

    public static void searchTask(TimesheetTasks searchTask) throws Exception {
        String query = "SELECT * FROM timesheet_app_tasks WHERE task_no = '"+searchTask.taskNo+"';";
        TimesheetTaskDAO.runQuery(query);
    }

}
