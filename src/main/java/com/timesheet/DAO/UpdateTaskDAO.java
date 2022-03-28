package com.timesheet.DAO;

import com.timesheet.Model.TimesheetTasks;

public class UpdateTaskDAO {

    public static void UpdateTask(TimesheetTasks updateTasks) throws Exception {
        String query = "UPDATE timesheet_app_tasks SET tasks_assigned = '"+updateTasks.newTask+"' WHERE task_no = '"+updateTasks.taskNo+"';";
        TimesheetTaskDAO.runQuery(query);
    
    }

    public static void UpdateStatus(TimesheetTasks updateStatus) throws Exception {
        String query = "UPDATE timesheet_app_tasks SET task_status = '"+updateStatus.taskStatus+"' WHERE task_no = '"+updateStatus.taskNo1+"';";
        TimesheetTaskDAO.runQuery(query);
    }

    public static void UpdateDeadline(TimesheetTasks updateDeadline) throws Exception {
        String query = "UPDATE timesheet_app_tasks SET task_deadline = '"+updateDeadline.taskDeadline+"' WHERE task_no = '"+updateDeadline.taskNo2+"';";
        TimesheetTaskDAO.runQuery(query);
    }

}
