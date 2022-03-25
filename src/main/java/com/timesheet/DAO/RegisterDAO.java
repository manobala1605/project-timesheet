package com.timesheet.DAO;

import com.timesheet.Model.TimesheetUser;

public class RegisterDAO {
    public static void addUser(TimesheetUser users) throws Exception
    {
        //insert 
		String query = "INSERT INTO timesheet_app_users (NAME,email_id,PASSWORD,project) VALUES('"+users.name+"','"+users.emailID+"','"+users.password+"','"+users.project+"');" ;
		TimesheetUserDAO.runQuery(query);
	}
    
}
