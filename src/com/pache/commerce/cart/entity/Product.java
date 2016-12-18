/**
 * 
 */
package com.pache.commerce.cart.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author lpache
 *
 */
@Entity
public class Product {
	/* A unique identifier for the product*/
	@Id
	private String id;
	/* Display name of product.*/
	private String name; 
	/* Image URL representing the product.*/
	private String image; 
	/* The price of the product.*/
	private BigDecimal price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	

}
