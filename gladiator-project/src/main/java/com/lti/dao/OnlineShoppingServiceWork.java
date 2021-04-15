package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.CartItem;
import com.lti.entity.Retailer;
import com.lti.entity.User;
import com.lti.entity.UserCart;

@Component("onlineShop1")
public class OnlineShoppingServiceWork implements OnlineShoppingService{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addRetailer(Retailer retailer){
	
			entityManager.persist(retailer);
	
	}
	
	@Transactional
	public void addCartItems(CartItem cartItem) {
		
		entityManager.persist(cartItem);
		
	}
	
	@Transactional
	public void addUser(User user) {
		entityManager.persist(user);
		
	}
	@Transactional
	public void addUserAlongWithCart(UserCart userCart){
		entityManager.merge(userCart);
		
		
	}
	@Transactional
	public void retailerAddingProducts(Retailer retailer) {
		entityManager.merge(retailer);
		
	}

}
