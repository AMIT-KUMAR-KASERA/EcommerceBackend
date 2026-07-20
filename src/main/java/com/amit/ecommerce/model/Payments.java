package com.amit.ecommerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.Order;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="tbl_payment")
public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="payment_id")
	private Integer paymentId;
	
	@NotNull(message = "Payment Amount is Mandatory and cant be null")
	@Column(name="payment_amount")
	private double payementAmount;
	
	@Column(name="payment_date")
	private LocalDateTime paymentDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="payment_type")
	private PaymentMethod payeMethod;
	
	@Enumerated(EnumType.STRING)
	@Column(name="payment_status")
	private PaymentStatus paymentStatus;
	
	@OneToOne
	@JoinColumn(name="order_id")
	private Orders order;
	
	
}
