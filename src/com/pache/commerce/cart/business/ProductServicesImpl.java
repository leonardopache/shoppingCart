/**
 * 
 */
package com.pache.commerce.cart.business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.pache.commerce.cart.entity.Product;
import com.pache.commerce.cart.model.ProductDAO;

/**
 * @author lpache
 *
 */
@Stateless
public class ProductServicesImpl implements ProductService{
	
	@EJB
	private ProductDAO productDAO;
	
	@Override
	public List<Product> findAllProducts(){
		return productDAO.getAll();
	}

}
