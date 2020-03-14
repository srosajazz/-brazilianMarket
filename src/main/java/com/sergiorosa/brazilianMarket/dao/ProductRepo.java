package com.sergiorosa.brazilianMarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.sergiorosa.brazilianMarket.model.Product;

public interface ProductRepo extends CrudRepository<Product,Integer>{
	
}
