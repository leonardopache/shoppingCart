/**
 * 
 */
package com.pache.commerce.cart.business;

import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.pache.commerce.cart.entity.Product;
import com.pache.commerce.cart.entity.ShoppingCart;

/**
 * Rest Resource that provides access to business implementation and repository across the HTTP protocol
 * @author lpache
 */
@Path("rest")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {
	
	private ProductService productService;
	private ShoppingCartService shoppingCartService;
	
	public ProductResource() {
		String lookupName;
		try {
		    lookupName = "java:module/ProductServicesImpl";
		    productService = (ProductService) InitialContext.doLookup(lookupName);
		    
		    lookupName = "java:module/ShoppingCartServiceImpl";
		    shoppingCartService = (ShoppingCartService) InitialContext.doLookup(lookupName);
		} catch (NamingException e) {
		    e.printStackTrace();
		}
	}
	
	@GET
	@Path("products")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll(){
		List<Product> products = productService.findAllProducts();
		return Response.status(200).entity(new Gson().toJson(products)).build();
	}
	
	@POST
	@Path("cart/add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addCommerceItem(String basket){
		ShoppingCart shoppingCart = new Gson().fromJson(basket, ShoppingCart.class);
		return new Gson().toJson(shoppingCartService.executeSomeProcess(shoppingCart));
	}
	
	@GET
	@Path("cart/{id}")
	public String findShoppingCart(String cart, @PathParam("id") String id){
		ShoppingCart shoppingCart = new Gson().fromJson(cart, ShoppingCart.class);
		if(shoppingCart == null){
			shoppingCart = new ShoppingCart(id);
		}
		
		return new Gson().toJson(shoppingCart);
	}
	
	@DELETE
	@Path("cart/{id}/delete/{item}")
	public String removeCommerceItem(String cart, @PathParam("id") String id, @PathParam("item") String item){
		ShoppingCart shoppingCart = new Gson().fromJson(cart, ShoppingCart.class);
		for (int i = 0; i < shoppingCart.getItems().size(); i++){
			if(shoppingCart.getItems().get(i).getProduct_id().equals(item)){
				shoppingCart.getItems().remove(i);
				break;
			}
		}
		return new Gson().toJson(shoppingCart);
	}
}
