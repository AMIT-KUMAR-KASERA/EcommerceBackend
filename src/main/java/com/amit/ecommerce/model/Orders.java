package com.amit.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private Integer orderId;
	
	
	@Column(name="order_date")
	private LocalDateTime orderDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="order_status")
	private OrderStatus orderStatus;
	
	private double totalAmount;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	// One to Many with Order Item
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<OrderItem> orderItem=new ArrayList<>();
	
	
	//One to One with Payment Table
	
	
	//One to One with Shipping Entity
	
	
}
