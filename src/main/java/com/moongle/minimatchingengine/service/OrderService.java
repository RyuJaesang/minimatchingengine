package com.moongle.minimatchingengine.service;

import com.moongle.minimatchingengine.dao.Order;
import com.moongle.minimatchingengine.dao.Orderbook;
import com.moongle.minimatchingengine.repository.OrderbookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderbookRepository orderbookRepository;

    public Orderbook newOrder(Order order) {
        Orderbook orderbook = order.toOrderbook(order);

        return orderbookRepository.save(orderbook);
    }
}
