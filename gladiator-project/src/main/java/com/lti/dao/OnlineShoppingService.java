package com.lti.dao;

import com.lti.entity.CartItem;
import com.lti.entity.Retailer;
import com.lti.entity.User;
import com.lti.entity.UserCart;

public interface OnlineShoppingService {
	
	public void addRetailer(Retailer reatiler);
	public void addCartItems(CartItem cartItem);
	public void addUser(User user);
	public void addUserAlongWithCart(UserCart userCart);
	public void retailerAddingProducts(Retailer retailer);

}
