package com.moongle.minimatchingengine.recordloader;

import com.moongle.minimatchingengine.dao.Issues;
import com.moongle.minimatchingengine.repository.IssuesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(IssuesRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Issues("삼성전자", "KR001", Long.valueOf(50000), Long.valueOf(65000), Long.valueOf(35000))));
            log.info("Preloading " + repository.save(new Issues("코스콤", "KR002", Long.valueOf(10000), Long.valueOf(13000), Long.valueOf(7000))));
            log.info("Preloading " + repository.save(new Issues("금융결제원", "KR003", Long.valueOf(10000), Long.valueOf(13000), Long.valueOf(7000))));
        };
    }
}
