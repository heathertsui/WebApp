package com.fdm.webapp.product;

import com.fdm.webapp.storeinventory.StoreInventory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	private int productID;
	private String description;

	@ManyToOne
	private StoreInventory storeInventory;

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Product(int productID, String description) {
		super();
		this.productID = productID;
		this.description = description;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", description=" + description + "]";
	}


}
