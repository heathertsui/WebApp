package com.fdm.webapp.login;

import com.fdm.webapp.user.User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Login {

	@Id
	private int loginID;

	private String username;

	private String password;

	@OneToOne(mappedBy = "login")
	private User user;

	public int getLoginID() {
		return loginID;
	}

	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login(int loginID, String username, String password) {
		super();
		this.loginID = loginID;
		this.username = username;
		this.password = password;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Login [loginID=" + loginID + ", username=" + username + ", password=" + password + "]";
	}

}
