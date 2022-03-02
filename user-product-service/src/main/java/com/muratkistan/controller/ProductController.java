package com.muratkistan.controller;

import com.muratkistan.dtos.ProductDto;
import com.muratkistan.service.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user-product")
@RequiredArgsConstructor
public class ProductController {

    private  final ProductService productService;

    @PostMapping("/products/add")
    public ResponseEntity<ProductDto> add(@Valid @RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productService.addProduct(productDto));
    }

    @GetMapping("/products/getAll")
    public ResponseEntity<List<ProductDto>> getProductsOfUser(){
        return ResponseEntity.ok(productService.getAllProducts());

    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable("id") long id){
        return ResponseEntity.ok(productService.getProductById(id));

    }

    @DeleteMapping("/products/delete/{id}")
    public ResponseEntity<ProductDto> delete(@PathVariable("id") int id) {
        return ResponseEntity.ok(productService.deleteProduct(id));
    }

    @PutMapping("/products/update/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable("id") long id,@Valid @RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productService.updateProductById(id,productDto));
    }

    @GetMapping("/products/users/{userId}")
    public ResponseEntity<List<ProductDto>> getProductsOfUser(@PathVariable("userId") long userId){
        return ResponseEntity.ok(productService.getProductsOfUser(userId));

    }

}
