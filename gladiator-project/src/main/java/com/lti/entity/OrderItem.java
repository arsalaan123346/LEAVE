package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ORDER_ITEM")
public class OrderItem {
	
	@Id
	@Column(name = "ORDER_ITEM_ID")
	private int orderItemId;
	
	@Column(name = "ORDER_QUANTITY")
	private int orderQuantity;
	
	@Column(name = "ORDER_UNIT_PRICE")
	private double orderUnitPrice;
	
	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getOrderUnitPrice() {
		return orderUnitPrice;
	}

	public void setOrderUnitPrice(double orderUnitPrice) {
		this.orderUnitPrice = orderUnitPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "ORDER_STATUS")
	private String orderStatus;
	
	@ManyToOne
	@JoinColumn(name = "ORDER_ID")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	

}
