package com.moongle.minimatchingengine.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Issues {
    private @Id @GeneratedValue Long id;
    private String issueName;
    private String issueCode;
    private Long basePrice;
    private Long upLimitPrice;
    private Long downLimitPrice;

    public Issues(String issueName, String issueCode, Long basePrice, Long upLimitPrice, Long downLimitPrice) {
        this.issueName = issueName;
        this.issueCode = issueCode;
        this.basePrice = basePrice;
        this.upLimitPrice = upLimitPrice;
        this.downLimitPrice = downLimitPrice;
    }

    public Issues() {
    }
}
