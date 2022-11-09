package com.moongle.minimatchingengine.controller;

import com.moongle.minimatchingengine.dao.Issues;
import com.moongle.minimatchingengine.service.IssuesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class IssuesController {
    @Autowired
    private final IssuesService issuesService;

    @GetMapping("/issues")
    List<Issues> all() {
        return issuesService.getAllIssues();
    }
}
