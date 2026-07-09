package com.amit.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity

@Table(name="user_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private Integer addressId;
	
	@NotNull(message = "flate Number is Mandatory")
	@Column(name="flate_no")
	private String flateNo;
	
	@NotNull(message ="Street is Mandatory")
	@Column(name="street")
	private String street;
	
	@Size(max = 20)
	@NotNull(message = "City is Mandatory")
	@Column(name="city")
	private String city;
	
	@Size(max = 20)
	@NotNull(message = "State is Mandatory")
	@Column(name="state")
	private String state;
	
	
	@NotNull(message = "ZipCode is Mandatory")
	@Column(name="zipcode")
	private String zipCode;
	
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	

}
