package com.muratkistan.service.abstracts;

import com.muratkistan.dtos.UserDto;

import java.util.List;

public interface UserService {
    UserDto addUser(UserDto userDto);
    List<UserDto> getAllUsers();
    UserDto getUserById(Long userId);
    UserDto updateUser(Long userId,UserDto userDto);
    UserDto deleteUser(Long id);


}
