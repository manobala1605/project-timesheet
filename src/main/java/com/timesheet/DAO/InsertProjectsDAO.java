package com.timesheet.DAO;

public class InsertProjectsDAO {
    public static void addProject(String userId,String projectcode,String projectName,String projectCreated,String status,String totalTasks,String tasksCompleted,String deadline, String deadline2) throws Exception 
	{

		//String query = "INSERT INTO timesheet_app_projects (project_code,project_name,project_created,STATUS,total_tasks,tasks_completed,deadline)VALUES(?,?,?,?,?,?,?);";
		String query = "INSERT INTO timesheet_app_projects (user_id,project_code,project_name,project_created,STATUS,total_tasks,tasks_completed,deadline)VALUES('"+userId+"','"+projectcode+"','"+projectName+"','"+projectCreated+"','"+status+"','"+totalTasks+"','"+tasksCompleted+"','"+deadline+"');";

		TimesheetTaskDAO.runQuery(query);

	}
    
}
