package com.timesheet.DAO;

public class UpdateProjectDAO {
    public static void updateProjectName(String projectName1,String userId1) throws Exception {

		String query = "UPDATE timesheet_app_projects SET project_name = '"+projectName1+"' WHERE project_code = '"+userId1+"';";
		TimesheetTaskDAO.runQuery(query);

	}
	public static void updateProjectStatus(String status1,String userId1) throws Exception {

		String query = "UPDATE timesheet_app_projects SET STATUS = '"+status1+"' WHERE user_id = '"+userId1+"';";
		TimesheetTaskDAO.runQuery(query);

	}
	public static void updateProjectTaskCompleted(String tasksCompleted1, String userId1) throws Exception {

		String query = "UPDATE timesheet_app_projects SET tasks_completed = '"+tasksCompleted1+"' WHERE user_id = '"+userId1+"';";
		TimesheetTaskDAO.runQuery(query);

	}
	public static void updateProjectDeadline(String deadline1,String userId1) throws Exception {

		String query = "UPDATE timesheet_app_projects SET deadline = '"+deadline1+"' WHERE user_id = '"+userId1+"';";
        TimesheetTaskDAO.runQuery(query);
	}
    
}
