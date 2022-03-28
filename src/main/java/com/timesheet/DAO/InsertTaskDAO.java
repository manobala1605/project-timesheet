package com.timesheet.DAO;

import com.timesheet.Model.TimesheetTasks;

public class InsertTaskDAO {

    public static void insertTask(TimesheetTasks timesheetTasks) throws Exception {

        String query = "INSERT INTO timesheet_app_tasks (task_no,project_code,tasks_assigned,task_status,duration,task_deadline)VALUES('"+timesheetTasks.taskNo+"','"+timesheetTasks.projectCode+"','"+timesheetTasks.taskAssigned+"','"+timesheetTasks.taskStatus+"','"+timesheetTasks.duration+"','"+timesheetTasks.taskDeadline+"');";

        TimesheetTaskDAO.runQuery(query);
    }
    
    
}
