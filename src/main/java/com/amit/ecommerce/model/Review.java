package com.amit.ecommerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="user_review")
public class Review {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="review_id")
	private Integer reviewId;
	
	@Column(name="comment")
	@NotNull(message = "please Provide Rating, Can not be null")
	private String comment;
	
	@Column(name="created_at")
	private LocalDateTime createAt;
	
	@Column(name="rating")
	private Integer rating;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Products product;
	
}
