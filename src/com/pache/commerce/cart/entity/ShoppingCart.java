/**
 * 
 */
package com.pache.commerce.cart.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author lpache
 *
 */
public class ShoppingCart implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	/* All the commerce items on the current shopping cart.*/
	private List<CommerceItem> items;
	/*Order total value, calculated summing the amount of all commerce items.*/
	private BigDecimal amount;
	
	public ShoppingCart(){}
	
	public ShoppingCart(String id) {
		setId(id);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<CommerceItem> getItems() {
		return items;
	}
	public void setItems(List<CommerceItem> items) {
		this.items = items;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}
