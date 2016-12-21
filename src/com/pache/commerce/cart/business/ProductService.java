package com.pache.commerce.cart.business;

import java.util.List;

import javax.ejb.Local;

import com.pache.commerce.cart.entity.Product;

/**
 * Service EJB responsible for the communication between HTTP Services or View app with the DAO Services.
 * Functions of business requirements 
 * @author lpache
 */
@Local
public interface ProductService {
	
	public List<Product> findAllProducts();
}
