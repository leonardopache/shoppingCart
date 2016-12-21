/**
 * 
 */
package com.pache.commerce.cart.model;

import java.util.List;

import javax.ejb.Local;

import com.pache.commerce.cart.entity.Product;

@Local
public interface ProductDAO {

	public List<Product> getAll();
	public void insert(Product product);
	public void executeSQL(String strSQL);
}
