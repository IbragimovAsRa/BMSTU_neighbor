package net.api.service;

import net.api.dto.UserDto;
import net.api.model.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    UserDto findById(Long id);

    void delete(Long id);
}
