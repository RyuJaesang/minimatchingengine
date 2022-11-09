package com.moongle.minimatchingengine.repository;

import com.moongle.minimatchingengine.dao.Issues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssuesRepository extends JpaRepository <Issues, Long> {

}
