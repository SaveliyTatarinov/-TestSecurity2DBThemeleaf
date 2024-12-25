package ru.tatarinov.TestSecurity2DBThemeleaf.service;

import ru.tatarinov.TestSecurity2DBThemeleaf.dto.UserDto;
import ru.tatarinov.TestSecurity2DBThemeleaf.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}

