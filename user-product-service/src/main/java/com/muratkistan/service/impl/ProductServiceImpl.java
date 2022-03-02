package com.muratkistan.service.impl;

import com.muratkistan.dtos.ProductDto;
import com.muratkistan.dtos.UserDto;
import com.muratkistan.exception.NotFoundException;
import com.muratkistan.model.Product;
import com.muratkistan.model.User;
import com.muratkistan.repository.ProductRepository;
import com.muratkistan.service.abstracts.ProductService;
import com.muratkistan.service.abstracts.UserService;
import com.muratkistan.util.result.DataResult;
import com.muratkistan.util.result.SuccessDataResult;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    private final UserService userService;


    @Override
    public ProductDto addProduct(ProductDto productDto) {
        return modelMapper.map(productRepository.save(modelMapper.map(productDto,Product.class)),ProductDto.class);
    }

    @Override
    public ProductDto deleteProduct(long productId) {
        Product product = productRepository.findById(productId).orElseThrow(() ->new NotFoundException("Product"));
        productRepository.delete(product);

        return modelMapper.map(product,ProductDto.class);
    }

    @Override
    public ProductDto updateProductById(long productId, ProductDto productDto) {
        getProductById(productId);
        productDto.setProductId(productId);
        return modelMapper.map(productRepository.save(modelMapper.map(productDto,Product.class)),ProductDto.class);

    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> modelMapper.map(product,ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public ProductDto getProductById(long productId) {
        Product product = productRepository.findById(productId).orElseThrow(() ->new NotFoundException("Product"));
        return modelMapper.map(product,ProductDto.class);

    }

    @Override
    public List<ProductDto> getProductsOfUser(long userId) {
        UserDto userDB = userService.getUserById(userId);
        List<Product> products = productRepository.findByUser(modelMapper.map(userDB,User.class));
        return products.stream().map(product -> modelMapper.map(product,ProductDto.class)).collect(Collectors.toList());
    }
}
