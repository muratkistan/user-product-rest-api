package com.muratkistan.service.abstracts;

import com.muratkistan.dtos.ProductDto;
import com.muratkistan.util.result.DataResult;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    ProductDto addProduct(ProductDto productDto);
    ProductDto deleteProduct(long  productId);
    ProductDto updateProductById(long productId,ProductDto productDto);
    List<ProductDto> getAllProducts();
    ProductDto getProductById(long userId);
    List<ProductDto> getProductsOfUser(long userId);

}
