package com.Crud.CrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Crud.CrudOperation.model.Product;
import com.Crud.CrudOperation.service.ProductService;

//@RequestMapping("/PS")
@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;

	@PostMapping(path="/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productservice.saveProduct(product);

	}

	@PostMapping(path="/addAllProduct")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return productservice.saveProducts(products);
	}

	@GetMapping(path="/Products")
	public List<Product> findAllProducts() {
		return productservice.getProducts();
	}

	@GetMapping(path="/ProductbyId/{id}")
	public Product findProductById(@PathVariable int id) {
		return productservice.getProduct(id);
	}
//	@GetMapping("/Product/{name}")
//	public Product findProductByName(@PathVariable String name) {
//		return productservice.getProductByName(name);
//	}
	@PutMapping(path="/update")
	public Product updateProduct(@RequestBody Product product) {
		return productservice.updateProduct(product);

	}
	@DeleteMapping(path="/Delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productservice.deleteProduct(id);
	}
	
}
