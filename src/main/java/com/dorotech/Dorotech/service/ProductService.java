package com.dorotech.Dorotech.service;

import com.dorotech.Dorotech.dto.ProductDTO;
import com.dorotech.Dorotech.dto.ProductRegisterDTO;
import com.dorotech.Dorotech.model.Product;
import com.dorotech.Dorotech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductDTO registerProduct(ProductRegisterDTO productDTO) {
        Product registeredProduct = productRepository.save(new Product(productDTO));
        return new ProductDTO(registeredProduct);
    }

    public ProductDTO getProductById(Long id) {
        Product product = productRepository.getReferenceById(id);
        return new ProductDTO(product);
    }


}
