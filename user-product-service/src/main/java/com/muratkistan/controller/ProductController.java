package com.muratkistan.controller;

import com.muratkistan.dtos.ProductDto;
import com.muratkistan.service.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user-product/products")
@RequiredArgsConstructor
public class ProductController {

    private  final ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<ProductDto> add(@Valid @RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productService.addProduct(productDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ProductDto>> getProductsOfUser(){
        return ResponseEntity.ok(productService.getAllProducts());

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ProductDto> delete(@PathVariable("id") int id) {
        return ResponseEntity.ok(productService.deleteProduct(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable("id") long id,@Valid @RequestBody ProductDto customerDto) {
        return ResponseEntity.ok(productService.updateProductById(id,customerDto));
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<ProductDto>> getProductsOfUser(@PathVariable("userId") long userId){
        return ResponseEntity.ok(productService.getProductsOfUser(userId));

    }

}
