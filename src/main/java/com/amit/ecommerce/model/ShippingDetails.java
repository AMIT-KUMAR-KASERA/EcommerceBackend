package com.amit.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="tbl_shipping_details")
public class ShippingDetails {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="shipping_id")
	private Integer shippingId;
	
	@NotNull(message = "Address is Mandatory and it can't be null")
	@Column(name="address")
    private String address;
	
	@NotNull(message = "City is Mandatory and it cna't be null")
	private String City;
	
	@NotNull(message = "countery is Mandatory and it cna't be null")
	private String country;
	
	@NotNull(message = "PostatlCode is Mandatory and It can't be null")
	private String postalCode;
	
	@ManyToOne
	@JoinColumn(name="shipper_id")
	private Shipper shipper;
	
	@OneToOne
	private Orders order;
	
}
