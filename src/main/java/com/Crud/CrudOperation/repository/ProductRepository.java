package com.Crud.CrudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Crud.CrudOperation.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	//Product findbyName(String name);

}
