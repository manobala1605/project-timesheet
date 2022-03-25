package com.timesheet.Logic;

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
   
            ResultSet query=mystatement.executeQuery("select * from timesheet_app_users;");
            while(query.next())
            {
                System.err.println(query.getString("user_id")+"  --->  "+query.getString("name")+"  ----->   "+query.getString("email_id")+"  ----->   "+query.getString("password")+"  ------->   "+query.getString("project"));  
             
            }
         
            }   
            catch (Exception e)
            {
               System.err.println(e);
            }

    }

    
}
