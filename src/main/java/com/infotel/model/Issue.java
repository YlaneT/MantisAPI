package com.infotel.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Issue {
    private String        id;
    private String        project;
    private String        category;
    private LocalDateTime submitted;
    private LocalDateTime lastUpdated;
    private String        reporter;
    private String        assigned;
    private String        priority;
    private String        status;
    private String        severity;
    private String        reproducibility;
    private String        summary;
    private String        description;
    private List<String>  tags; // id, name, description
    // Optional fields /!\ appear before tags
    private String        stepsToReproduce;
    private String        additionalInformation;
    
    
    // TODO: Custom fields
    public Issue () {
        tags = new ArrayList<>();
    }
}
