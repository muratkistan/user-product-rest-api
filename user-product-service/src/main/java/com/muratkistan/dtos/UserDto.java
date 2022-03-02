package com.muratkistan.dtos;

import com.muratkistan.util.annotations.identityNumber.UniqueIdentityNumber;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private long userId;

    @NotNull
    @UniqueIdentityNumber
    private String identityNumber;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String emailAddress;

    @NotNull
    private String phoneNumber;
}
