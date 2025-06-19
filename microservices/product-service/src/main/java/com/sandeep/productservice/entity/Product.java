package com.sandeep.productservice.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(schema = "product",name="tblproduct")
@Data
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="prod_id",insertable = true,nullable = false)
	private Long productId;
	@Column(name="prod_name")
	private String prodName;
	@Column(name="prod_description")
	private String prodDesc;
	@Column(name="price")
	private  BigDecimal price;
	

}
