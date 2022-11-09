package com.moongle.minimatchingengine.controller;

import com.moongle.minimatchingengine.dao.Order;
import com.moongle.minimatchingengine.dao.Orderbook;
import com.moongle.minimatchingengine.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/order/new")
    Orderbook newOrder(@RequestBody @Valid Order order) {
        return orderService.newOrder(order);
    }
}
