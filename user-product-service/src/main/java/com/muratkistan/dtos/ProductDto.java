package com.muratkistan.dtos;

import com.muratkistan.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {

    private long productId;
    @NotNull
    private String productName;
    @NotNull
    private String category;
    @NotNull
    private int price;
    private User user;
}
