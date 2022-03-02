package com.muratkistan.util.annotations.code;

import com.muratkistan.model.Product;
import com.muratkistan.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class UniqueproductCodeValidator implements ConstraintValidator<UniqueProductCode,String> {

    private final ProductRepository productRepository;

    //Check  Product Code is already exist?
    @Override
    public boolean isValid(String productCode, ConstraintValidatorContext context) {
        Product product = productRepository.findByProductCode(productCode);
        if(product != null) {//Product already exist
            return false;
        }
        return true;
    }
}
