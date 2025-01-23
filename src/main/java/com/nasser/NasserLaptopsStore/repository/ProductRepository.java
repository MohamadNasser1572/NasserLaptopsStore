package com.nasser.NasserLaptopsStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasser.NasserLaptopsStore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
