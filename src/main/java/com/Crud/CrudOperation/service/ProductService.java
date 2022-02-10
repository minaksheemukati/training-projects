package com.Crud.CrudOperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud.CrudOperation.model.Product;
import com.Crud.CrudOperation.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}

	public Product getProduct(int id) {
		return repository.findById(id).orElse(null);
	}

	public List<Product> getProducts() {
		return repository.findAll();
	}

//	public Product getProductByName(String name) {
//		return repository.findbyName(name);
//	}

	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "removed product..||" + id;

	}

	public Product updateProduct(Product product) {
	Product existProduct=repository.findById(product.getId()).orElse(null);
	existProduct.setName(product.getName());
	existProduct.setPrice(product.getPrice());
	existProduct.setQuantity(product.getQuantity());
	return repository.save(existProduct);
 }
}