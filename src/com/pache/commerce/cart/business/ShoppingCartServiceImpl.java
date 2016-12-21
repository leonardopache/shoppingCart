/**
 * 
 */
package com.pache.commerce.cart.business;

import java.util.Calendar;

import javax.ejb.Remove;
import javax.ejb.Stateful;

import com.pache.commerce.cart.entity.CommerceItem;
import com.pache.commerce.cart.entity.ShoppingCart;

/**
 * Implementation of {@link ShoppingCartService}
 * @author lpache
 */
@Stateful
public class ShoppingCartServiceImpl implements ShoppingCartService{
	

    @Remove
    public void remove() {
    }

	@Override
	public ShoppingCart executeSomeProcess(ShoppingCart shoppingCart) {
		for (CommerceItem item : shoppingCart.getItems()) {
			if (item.getId() == null) {
				item.setId(String.valueOf(Calendar.getInstance().getTimeInMillis()));
			}
		}
		return shoppingCart;
	}
}
