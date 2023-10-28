package com.jobsystem.schedule;
import java.util.Date;
import org.springframework.data.annotation.Id;

public class ScheduleJob {
    @Id
    public String id;
    public String jobId;
    public String jobName;
    public String jobType;
    public Date scheduledDate;
    public String agentId;
    public String agentName;
    public ScheduleJob() {}
    public ScheduleJob(String jobId, String jobName, 
String jobType, Date scheduledDate, String agentId, 
String agentName) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobType = jobType;
        this.scheduledDate = scheduledDate;
        this.agentId = agentId;
        this.agentName = agentName;
    }
}