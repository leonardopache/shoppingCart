package com.pache.commerce.cart.business;

import java.util.List;

import javax.ejb.Local;

import com.pache.commerce.cart.entity.Product;

@Local
public interface ProductService {
	
	public List<Product> findAllProducts();
}
