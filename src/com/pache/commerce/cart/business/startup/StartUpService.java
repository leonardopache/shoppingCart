package com.pache.commerce.cart.business.startup;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.pache.commerce.cart.model.ProductDAO;

/**
 * Service executed while app startup to insert some data.
 * 
 * @author lpache
 */
@Startup
@Singleton
public class StartUpService {
	
	@EJB
	private ProductDAO productDAO;
	
	@PostConstruct
	public void init(){
		StringBuffer strSQL = new StringBuffer();
		strSQL.append("insert into Product (id, name, image, price) values (1, 'Video Game PS4', '', 450);");
		strSQL.append("insert into Product (id, name, image, price) values (2, 'Table Dell Venue 8', '', 350);");
		strSQL.append("insert into Product (id, name, image, price) values (3, 'Iphone 6S', '', 950);");
		strSQL.append("insert into Product (id, name, image, price) values (4, 'TV LG', '', 1400);");
		productDAO.executeSQL(strSQL.toString());
	}
}
