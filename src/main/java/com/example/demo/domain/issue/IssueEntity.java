package com.example.demo.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;

//Issueモデル（Entity）
@AllArgsConstructor
@Data
public class IssueEntity {
    private long id;
    private String summary;
    private String description;
}
