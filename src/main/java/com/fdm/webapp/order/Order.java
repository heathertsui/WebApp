package com.fdm.webapp.order;

import java.util.List;

import com.fdm.webapp.orderdetails.OrderDetails;
import com.fdm.webapp.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Order {
	@Id
	@GeneratedValue
	private int orderID;
	private double priceTotal;
	private int userID;
	@ManyToOne
	@JoinColumn(name = "FK_Order_ID")
	private User user;
	@OneToMany(mappedBy = "order")
	private List<OrderDetails> orderDetails;

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Order() {
		super();
	}

	public Order(int orderID, double priceTotal, int userID) {
		super();
		this.orderID = orderID;
		this.priceTotal = priceTotal;
		this.userID = userID;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public double getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", priceTotal=" + priceTotal + ", userID=" + userID + "]";
	}

}
