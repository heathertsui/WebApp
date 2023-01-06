package com.fdm.webapp.productRespository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdm.webapp.product.Product;

public interface ProductRespository extends JpaRepository<Product, Long> {

	List<Product> findByProductId(int productID);



}
