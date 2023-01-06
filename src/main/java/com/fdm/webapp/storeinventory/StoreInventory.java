package com.fdm.webapp.storeinventory;

import java.util.List;

import com.fdm.webapp.product.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class StoreInventory {

	@Id
	private int productID;
	private int stock;
	private String name;
	private int size;

	@OneToMany(mappedBy = "storeInventory")
	private List<Product> product;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public StoreInventory(int productID, int stock, String name, int size) {
		super();
		this.productID = productID;
		this.stock = stock;
		this.name = name;
		this.size = size;
	}

	public StoreInventory() {
		super();
		// TODO Auto-generated constructor stub
	}

}
