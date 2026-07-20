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
	private Orders order;
	
	@Column(name="ord_qty")
	private Integer quantity;
	
	//Order Item to Product
    @ManyToOne
    @JoinColumn(name="product_id")
    private Products product;       

    
    
    
    
    
    
    
    
    
    
	
	
	
    
	
    
}
