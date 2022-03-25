package com.timesheet.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.timesheet.Logic.Menu;

public class LoginUserDAO {
    public static void loginUser(String emailID,String password) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
        
        String query="SELECT * FROM timesheet_app_users WHERE email_id='"+emailID+"' and password ='"+password+"';";
        System.out.println(query);
      
        Statement statement= connection.createStatement();
        ResultSet result = ((Statement) statement).executeQuery(query);	
       
        if(emailID==null) {
            System.out.println("No records found - please register");
        }
        else if(password.equals(password)) 
        {
            System.out.println("WELCOME user....!");
             while(result.next()) 
            {
                emailID=result.getString("email_id");
                password=result.getString("password");
                System.err.println(result.getString("user_id")+"  --->  "+result.getString("name")+"  ----->   "+result.getString("email_id")+"  ----->    "+result.getString("project"));  

            }
            Menu.showMenu();
        }
        else {
            System.out.println("Invalid Credentials");
        }


    }
    
    
}
