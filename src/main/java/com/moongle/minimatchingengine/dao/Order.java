package com.moongle.minimatchingengine.dao;

import com.moongle.minimatchingengine.annotation.OrderPrice;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@OrderPrice(issuesName = "issuesName",  price = "orderPrice")
public class Order {
    @NotNull
    private String issuesName;
    private Long price;
    private String orderType;
    private String orderCondition;
    private String buySell;

    public Orderbook toOrderbook(Order order) {
        return new Orderbook(order.issuesName, order.price, order.orderType, order.orderCondition, order.buySell);
    }
}
