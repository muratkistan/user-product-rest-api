package com.muratkistan.dtos;

import com.muratkistan.model.User;
import com.muratkistan.util.annotations.code.UniqueProductCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    private long productId;

    @NotNull
    @Column(name = "product_code")
    @UniqueProductCode
    private String productCode;

    @NotNull
    private String productName;

    @NotNull
    private String category;

    @NotNull
    private int price;

    private User user;
}
