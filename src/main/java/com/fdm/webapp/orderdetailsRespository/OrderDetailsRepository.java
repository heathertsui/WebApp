package com.fdm.webapp.orderdetailsRespository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdm.webapp.order.Order;
import com.fdm.webapp.orderdetails.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {

	List<Order> findByOrderID(int orderID);

}
