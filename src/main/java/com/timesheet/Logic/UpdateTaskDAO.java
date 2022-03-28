package com.timesheet.Logic;

import com.timesheet.DAO.TimesheetTaskDAO;
import com.timesheet.Model.TimesheetTasks;

public class UpdateTaskDAO {

    public static void UpdateTask(TimesheetTasks updateTasks) throws Exception {
        String query = "UPDATE timesheet_app_tasks SET tasks_assigned = '"+updateTasks.newTask+"' WHERE task_no = '"+updateTasks.taskNo+"';";
        TimesheetTaskDAO.runQuery(query);
    
    }

}
