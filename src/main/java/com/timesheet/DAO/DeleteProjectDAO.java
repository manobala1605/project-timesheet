package com.timesheet.DAO;

public class DeleteProjectDAO {
    public static void deleteProject(String userId5) throws Exception{
		String query = "DELETE FROM timesheet_app_projects WHERE user_id = '"+userId5+"';";
        TimesheetTaskDAO.runQuery(query);		
	}
    
}
