package com.pache.commerce.cart.business;

import javax.ejb.Local;

import com.pache.commerce.cart.entity.ShoppingCart;

/**
 * Service EJB responsible for the communication between HTTP Services or View app with the DAO Services.
 * Functions of business requirements 
 * @author lpache
 */
@Local
public interface ShoppingCartService {

	public ShoppingCart executeSomeProcess(ShoppingCart shoppingCart);

}
