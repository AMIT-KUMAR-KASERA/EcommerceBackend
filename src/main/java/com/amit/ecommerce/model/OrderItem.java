package com.amit.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oredrItemId;
	
	
	@Column(name="order_id")
	private Integer orderId;
	
	@Column(name="ord_qty")
	private Integer quantity;
	
	//Order Item to Product
    @ManyToOne
    @JoinColumn(name="product_id")
    private Products product;       

    
    
    
    
    
    
    
    
    
    
	public Integer getOredrItemId() {
		return oredrItemId;
	}

	public void setOredrItemId(Integer oredrItemId) {
		this.oredrItemId = oredrItemId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public OrderItem(Integer oredrItemId, Integer orderId, Integer quantity, Products product) {
		super();
		this.oredrItemId = oredrItemId;
		this.orderId = orderId;
		this.quantity = quantity;
		this.product = product;
	}
	public OrderItem() {
		
	}

	@Override
	public String toString() {
		return "OrderItem [oredrItemId=" + oredrItemId + ", orderId=" + orderId + ", quantity=" + quantity
				+ ", product=" + product + "]";
	}
	
    
	
    
}
