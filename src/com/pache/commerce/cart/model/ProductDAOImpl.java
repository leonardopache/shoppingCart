/**
 * 
 */
package com.pache.commerce.cart.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pache.commerce.cart.entity.Product;

/**
 * @author lpache
 *
 */
@Stateless
public class ProductDAOImpl implements ProductDAO{
	
	@PersistenceContext
	private EntityManager em;

	public List<Product> getAll(){
		return em.createQuery("FROM Product").getResultList();
	}

	@Override
	public void insert(Product product) {
		em.persist(product);
		em.flush();
	}
}
