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
import jakarta.persistence.OneToOne;
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
	
	//multiple order can plece one user
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	 
	
	// One to Many with Order Item
	@OneToMany(mappedBy = "order",cascade  = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<OrderItem> orderItem=new ArrayList<>();
	
	
	//One to One with Payment Table
	@OneToOne
	@JoinColumn(name="payment_id")
	private Payments payments;	
	
	//One to One with Shipping Entity
	@OneToOne
	private ShippingDetails shipingDetails;
	
	

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public Payments getPayments() {
		return payments;
	}

	public void setPayments(Payments payments) {
		this.payments = payments;
	}

	public ShippingDetails getShipingDetails() {
		return shipingDetails;
	}

	public void setShipingDetails(ShippingDetails shipingDetails) {
		this.shipingDetails = shipingDetails;
	}
	
	
	
}
