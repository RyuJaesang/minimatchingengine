package com.moongle.minimatchingengine.service;

import com.moongle.minimatchingengine.dao.Issues;
import com.moongle.minimatchingengine.repository.IssuesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IssuesService {
    @Autowired
    private final IssuesRepository issuesRepository;

    public List<Issues> getAllIssues() {
        return issuesRepository.findAll();
    }
}
