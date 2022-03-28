package com.timesheet.DAO;

import com.timesheet.Model.TimesheetTasks;

public class DeleteTaskDAO {

    public static void deleteTask(TimesheetTasks deleteTask) throws Exception {
       String query = " DELETE FROM timesheet_app_tasks WHERE task_no = '"+deleteTask.taskNo+"';";
       TimesheetTaskDAO.runQuery(query);
    }

}
