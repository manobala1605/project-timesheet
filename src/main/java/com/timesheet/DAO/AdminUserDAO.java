package com.timesheet.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminUserDAO {
    public static void allUser() throws Exception{
        try {
             
            //Step 1 : Database Driver ( Optional)
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           //Step 2: Get the Connection
           Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
           System.err.println(connection);
           Statement mystatement = connection.createStatement();
   
            ResultSet query=mystatement.executeQuery("SELECT * FROM user_detail;");
            while(query.next())
            {
                System.err.println(query.getString("user_id")+"  --->  "+query.getString("name")+"  ----->   "+query.getString("email_id")+"  ----->   "+query.getString("project_code")+"  ------->   "+query.getString("project_name")+"  --->  "+query.getString("project_created")+"  ----->   "+query.getString("status")+"  ----->   "+query.getString("total_tasks")+"  ----->   "+query.getString("tasks_completed")+"  ----->   "+query.getString("deadline"));  
             
            }
         
            }   
            catch (Exception e)
            {
               System.err.println(e);
            }

    }

    
}

