package com.amit.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="tbl_shipper")
public class Shipper {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shipperId;
	
	@NotNull(message = "Name is Mandatory and it can't be null")
	private String name;
	
	@NotNull(message = "PhoneNumber is Mandatory and it can't be null")
	private String phoneNumber;

	@OneToMany(cascade =CascadeType.ALL,fetch = FetchType.LAZY )
	private List<ShippingDetails> shippingDetails=new ArrayList<ShippingDetails>();
	
}
