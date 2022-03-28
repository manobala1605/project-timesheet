package com.timesheet.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.timesheet.Model.TimesheetUser;

public class TimesheetUserDAO {
    
    public static void addUser(TimesheetUser users) throws Exception
    {
        	// Step 1 : Database Driver ( Optional)
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		System.out.println(connection);

        //insert 
		String query = "INSERT INTO timesheet_app_users (NAME,email_id,PASSWORD,project) VALUES('"+users.name+"','"+users.emailID+"','"+users.password+"','"+users.project+"');" ;
		System.err.println(query);

		// execute the query
		Statement statement = connection.createStatement();
		int rows = statement.executeUpdate(query);
		System.out.println("No of rows modified:" + rows);

		// close the connection
		connection.close();


	}

    public static void allUser() throws Exception{
        try {
             
            //Step 1 : Database Driver ( Optional)
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           //Step 2: Get the Connection
           Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
           System.err.println(connection);
           Statement mystatement = connection.createStatement();
   
            ResultSet codequery=mystatement.executeQuery("select * from timesheet_app_users;");
            while(codequery.next())
            {
                System.err.println(codequery.getString("user_id")+"  --->  "+codequery.getString("name")+"  ----->   "+codequery.getString("email_id")+"  ----->   "+codequery.getString("password")+"  ------->   "+codequery.getString("project"));  
             
            }
         
            }   
            catch (Exception e)
            {
               System.err.println(e);
            }

    }


    

        
}

