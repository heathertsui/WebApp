package com.fdm.webapp.orderRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdm.webapp.order.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findByOrderID(int orderID);


}
