package com.timesheet.DAO;

public class UpdateUserDAO {
    public static void updateUserId(String newUserId,String userId,String projectcode,String projectName,String projectCreated,String status,String totalTasks,String tasksCompleted,String deadline, String deadline2) throws Exception 
	{

		//String query = "INSERT INTO timesheet_app_projects (project_code,project_name,project_created,STATUS,total_tasks,tasks_completed,deadline)VALUES(?,?,?,?,?,?,?);";
		String query = "UPDATE timesheet_app_users SET user_id = '"+newUserId+"' WHERE user_id = '"+userId+"';";

		TimesheetTaskDAO.runQuery(query);

	}
	public static void updateUserName(String userId,String name) throws Exception 
	{

		//String query = "INSERT INTO timesheet_app_projects (project_code,project_name,project_created,STATUS,total_tasks,tasks_completed,deadline)VALUES(?,?,?,?,?,?,?);";
		String query = "UPDATE timesheet_app_users SET user_id = '"+userId+"' WHERE user_id = '"+name+"';";

		TimesheetTaskDAO.runQuery(query);

	}

    
}
