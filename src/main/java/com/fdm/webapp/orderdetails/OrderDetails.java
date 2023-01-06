package com.fdm.webapp.orderdetails;

import com.fdm.webapp.order.Order;
import com.fdm.webapp.product.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class OrderDetails {

	@Id

	private int productID;

	private int orderID;
	private int quantity;
	@ManyToOne
	private Order order;
	@ManyToOne
	private Product product;

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public OrderDetails(int productID, int orderID, int quantity) {
		super();
		this.productID = productID;
		this.orderID = orderID;
		this.quantity = quantity;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderDetails [productID=" + productID + ", orderID=" + orderID + ", quantity=" + quantity + "]";
	}


}
