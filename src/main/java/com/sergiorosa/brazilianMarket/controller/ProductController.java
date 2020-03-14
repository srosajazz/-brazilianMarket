package com.sergiorosa.brazilianMarket.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergiorosa.brazilianMarket.dao.ProductRepo;
import com.sergiorosa.brazilianMarket.model.Product;

@RestController
public class ProductController {
	@Autowired
	private ProductRepo repo;
	
	@GetMapping("/products")
	public ResponseEntity<ArrayList<Product>> showAll() {
		
		ArrayList<Product> list = (ArrayList<Product> )repo.findAll();
		return ResponseEntity.ok(list);	
	}
}
