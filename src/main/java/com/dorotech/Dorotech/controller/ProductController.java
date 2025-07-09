package com.dorotech.Dorotech.controller;

import com.dorotech.Dorotech.dto.ProductDTO;
import com.dorotech.Dorotech.dto.ProductRegisterDTO;
import com.dorotech.Dorotech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @Transactional
    public ResponseEntity<ProductDTO> registerProduct(@RequestBody ProductRegisterDTO productDTO, UriComponentsBuilder uriComponentsBuilder) {
        ProductDTO registeredProduct = productService.registerProduct(productDTO);
        return ResponseEntity.created(uriComponentsBuilder.path("/products/{id}").buildAndExpand(registeredProduct.id()).toUri()).body(registeredProduct);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }
}
