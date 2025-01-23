package com.nasser.NasserLaptopsStore.service;

import com.nasser.NasserLaptopsStore.dto.ProductDto;
import com.nasser.NasserLaptopsStore.model.Product;

public interface ProductService {
Product createProduct(ProductDto productDto);
}
