package com.lti.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.OnlineShoppingService;
import com.lti.entity.CartItem;
import com.lti.entity.Product;
import com.lti.entity.Retailer;
import com.lti.entity.User;
import com.lti.entity.UserCart;


public class OnlineShopping {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
	OnlineShoppingService ons = (OnlineShoppingService) ctx.getBean("onlineShop1");
@Test
public void testAddingAnUser() {
		
	
	
		/*Retailer ret = new Retailer();
		ret.setBusinessName("designer watches");
		ret.setReatailerMobileNo("25252552");
		ret.setRetailerEmail("arsalaan@gmail");
		ons.addRetailer(ret);
	
		CartItem ci = new CartItem();
		ci.setQuantity(5);
		ci.setUnitPrice(1667.0);
		ons.addCartItems(ci);*/
		User user = new User();
		user.setName("arsalaan");
		user.setEmail("arsalaan@qwe.com");
		user.setAddress("cotton green");
		user.setCity("mumbai");
		user.setPinCode(40010);
		user.setPassword("123");
		user.setMobileNo("123456");
		ons.addUser(user);
			
		
	}
	@Test
	public void testAddCartWithUser() {
		
		UserCart userCart = new UserCart();
		userCart.setTotalItem(5);
		userCart.setTotalPrice(500);
		
		User user = new User();
		user.setName("arsalaan");
		user.setEmail("arsalaan@qwe.com");
		user.setAddress("cotton green");
		user.setCity("mumbai");
		user.setPinCode(40010);
		user.setPassword("123");
		user.setMobileNo("123456");
		
		userCart.setUser(user);
		ons.addUserAlongWithCart(userCart);
	}
	@Test
	public void testRetailerAddingProducts() {
		Retailer r = new Retailer();
		r.setBusinessName("turban tribe");
		r.setRetailerEmail("turbantirbe@gmail.com");
		r.setReatailerMobileNo("9594409109");
		
		Product p = new Product();
		p.setpName("rolex");
		p.setpQuantity(1);
		p.setpDescription("rolex perpentiual");
		p.setpStatus("mint");
		p.setpImage("lti/eclipse/rolex.jpg");
		p.setRetailer(r);
		
		List<Product> products = new ArrayList<Product>();
		products.add(p);
		r.setProducts(products);
		
		ons.retailerAddingProducts(r);
		
	}
	
}
