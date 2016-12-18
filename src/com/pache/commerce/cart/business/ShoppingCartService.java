package com.pache.commerce.cart.business;

import javax.ejb.Local;

import com.pache.commerce.cart.entity.ShoppingCart;

/**
 * 
 * @author lpache
 *
 */
@Local
public interface ShoppingCartService {

	public ShoppingCart executeSomeProcess(ShoppingCart shoppingCart);

}
