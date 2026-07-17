package com.amit.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tbl_products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer product_Id; 
	
	@NotNull(message = "Product Name is Mandatory and cant be null")
	@Column(name="prod_name")
	private String name;
	
	@NotNull(message = "Product description is Mandatory and cant be null")
	@Column(name="prod_description")
	@Size(min=10,max=50)
	private String description;
	
	@NotNull(message = "Image URL is mandatory and can not be null")
	@Column(name="img_url")
	private String imageUrl;
	
	@NotNull(message = "Product Price is Mandatory and cant be null")
	@Column(name="prd_price")
	private Double price;
	
	@NotNull(message = "Product Category is Mandatory and cant be null")
	@Column(name="category_name")
	private  String category;
	
	
	@Column(name="is_availble")
	private boolean isAvailble=true;
	
	//OneToMany with OrderItem
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<OrderItem> orderItem=new ArrayList<>();
    
    
    
	

}
