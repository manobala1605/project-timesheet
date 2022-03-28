package com.timesheet.Model;

public class TimesheetTasks {
    public Long taskNo;
    public String projectCode;
    public String taskAssigned;
    public String taskStatus;
    public String duration;
    public String taskDeadline;
    public long taskNo1;
    public String newTask;
    public Long taskNo2;

    public TimesheetTasks(Long taskNo,String projectCode,String taskAssigned,String taskStatus,String duration,String taskDeadline){
        this.taskNo = taskNo;
        this.projectCode = projectCode;
        this.taskAssigned = taskAssigned;
        this.taskStatus = taskStatus;
        this.duration = duration;
        this.taskDeadline = taskDeadline;
    }

    public TimesheetTasks(long taskNo1) {
        this.taskNo1=taskNo1;
    }

    public TimesheetTasks(Long taskNo2, String newTask) {
        this.taskNo2=taskNo2;

    }

}
