package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_RETAILER")
public class Retailer {
	
	@Id
	@Column(name = "RETAILER_ID")
	private int retailerId;
	
	@Column(name = "BUSINESS_NAME")
	private String businessName;
	
	@Column(name = "RETAILER_EMAIL")
	private String retailerEmail;
	
	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getRetailerEmail() {
		return retailerEmail;
	}

	public void setRetailerEmail(String retailerEmail) {
		this.retailerEmail = retailerEmail;
	}

	public String getReatailerMobileNo() {
		return reatailerMobileNo;
	}

	public void setReatailerMobileNo(String reatailerMobileNo) {
		this.reatailerMobileNo = reatailerMobileNo;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Column(name = "RETAILER_MOBILE_NO")
	private String reatailerMobileNo;
	
	@OneToMany(mappedBy =  "retailer",cascade =CascadeType.MERGE)
	private List<Product> products;//one retailer can add multiple products

}
