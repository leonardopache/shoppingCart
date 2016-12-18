package com.pache.commerce.cart.business.startup;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.pache.commerce.cart.entity.Product;
import com.pache.commerce.cart.model.ProductDAO;

@Startup
@Singleton
public class StartUpService {
	
	@EJB
	private ProductDAO productDAO;
	
	@PostConstruct
	public void init(){
		System.out.println("EJB Iniciando..... ");
		Product product1 = new Product();
		product1.setId("1");
		product1.setImage("");
		product1.setName("Video Game PS4");
		product1.setPrice(new BigDecimal(450));
		productDAO.insert(product1);
		
		Product product2 = new Product();
		product2.setId("2");
		product2.setImage("");
		product2.setName("Table Dell Venue 8");
		product2.setPrice(new BigDecimal(350));
		productDAO.insert(product2);
		
		Product product3 = new Product();
		product3.setId("3");
		product3.setImage("");
		product3.setName("Iphone 6S");
		product3.setPrice(new BigDecimal(950));
		productDAO.insert(product3);
		System.out.println(productDAO.getAll());
	}
}
