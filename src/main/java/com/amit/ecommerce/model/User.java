package com.amit.ecommerce.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity //At run time a table will be created with name as User
@Table(name="tbl_user")//This will cutomize the table name with tbl_user
public class User {
	
	//User Table should have primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;
	
	
	@Column(name="user_email",unique = true)
	private String email; //column name will be same as propertyName
	
	@Column(name="user_pwd")
	private String password;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="user_phone")
	private String phoneNumber;
	
	@Column(name="user_reg_time")
	private LocalDateTime registerTime;
	
	@Enumerated(EnumType.STRING)
	@Column(name="user_role")
	private UserRole role;
	
	@Enumerated(EnumType.STRING)
	@Column(name="acct_status")
	private UserAccountStatus accountStatus;
	
	//Address Entity
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Address> address=new ArrayList<>();
	
}
