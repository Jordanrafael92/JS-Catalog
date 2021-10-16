package com.jordansilva.jscatalog.tests;

import java.time.Instant;

import com.jordansilva.jscatalog.dto.ProductDTO;
import com.jordansilva.jscatalog.entities.Category;
import com.jordansilva.jscatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.0,
				"https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/4-big.jpg",
				Instant.parse("2020-07-14T10:00:00Z"));
		product.getCategories().add(new Category(2L, "Eletronics"));
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
}
