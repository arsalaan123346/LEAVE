package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USERCART")
public class UserCart {
	
	//one to one with user
	@Id
	@Column(name = "CART_ID")
	private int cartId;
	
	@Column(name = "TOTAL_ITEM")
	private int totalItem;
	
	@Column(name = "TOTAL_PRICE")
	private double totalPrice;
	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	@OneToMany(mappedBy =  "userCart",cascade =CascadeType.MERGE)
	private List<CartItem> cartItems;//one cart can have multiple cartItems
	

	@OneToOne(fetch = FetchType.EAGER,cascade =CascadeType.MERGE)
	@JoinColumn(name = "USER_ID") //fk of tbl_cart
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
