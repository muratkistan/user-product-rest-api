package com.muratkistan.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private long userId;
    private String identityNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
}
