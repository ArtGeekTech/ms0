package com.techbow.usersystem.service;

import com.techbow.usersystem.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findById(Long id);
    User save(User input);
}
