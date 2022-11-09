package com.moongle.minimatchingengine.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Orderbook {
    private @Id @GeneratedValue Long orderId;
    private String issuesName;
    private Long price;
    private String orderType;
    private String orderCondition;
    private String buySell;

    public Orderbook() {
    }

    public Orderbook(String issuesName, Long price, String orderType, String orderCondition, String buySell) {
        this.issuesName = issuesName;
        this.price = price;
        this.orderType = orderType;
        this.orderCondition = orderCondition;
        this.buySell = buySell;
    }
}
