package com.timesheet.Logic;

import java.util.Scanner;
import com.timesheet.DAO.TimesheetTaskDAO;
import com.timesheet.Model.TimesheetProjects;

public class DeleteProject {
    public static void deleteproject() throws Exception{
        try (Scanner delete = new Scanner(System.in)) {
            String userId5 = delete.nextLine();
            TimesheetProjects deleteproject = new TimesheetProjects(userId5);
            System.err.println(deleteproject);
            TimesheetTaskDAO.deleteProject(deleteproject.userId5);
        }
    }
    
}
