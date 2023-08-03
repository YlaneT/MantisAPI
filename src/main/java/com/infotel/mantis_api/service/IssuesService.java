package com.infotel.mantis_api.service;

import com.infotel.mantis_api.exception.*;
import com.infotel.mantis_api.model.Issue;

import java.util.List;

public interface IssuesService {
    // Get an issue
    Issue searchIssue (int id) throws IssueNotFoundException;
    Issue searchIssue (int id, List<String> selectValues) throws IssueNotFoundException, FieldNotFoundException;
    
    // Get all issues
    List<Issue> searchAllIssues (int pageSize, int page, List<String> selectValues, int projectId) throws FieldNotFoundException, ProjectNotFoundException;
    
    // Edit issue
    String editIssue (Issue issue) throws IssueNotFoundException;
    
    // Add note to issue
    public void addNote(int id, String note);

    // Create an issue
    void createIssue (String category, String reproducibility, String severity,
        String priority, String platform, String os,
        String osVersion, String assigned, String summary, String description,
        String stepsToReproduce, String additionalInformation) throws FieldNotFoundException;
}
