package com.moongle.minimatchingengine.repository;

import com.moongle.minimatchingengine.dao.Orderbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderbookRepository extends JpaRepository <Orderbook, Long> {

}
