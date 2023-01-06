package com.fdm.webapp.user;

import java.util.List;

import com.fdm.webapp.login.Login;
import com.fdm.webapp.order.Order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class User {

	@Id
	private int userID;
	private String name;
	private String email;
	private int phone;

	@OneToMany(mappedBy = "user")
	private List<Order> order;
	@OneToOne
	private Login login;

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public User(int userID, String name, String email, int phone) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
