package com.bmstu.wmarket.services;


import com.bmstu.wmarket.models.User;
import com.bmstu.wmarket.models.enums.Role;
import com.bmstu.wmarket.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public boolean createUser(User user){
        String userEmail = user.getEmail();
        if (userRepository.findByEmail(user.getEmail()) != null) return false;
        user.setActive(true);
        user.getRoles().add(Role.ROLE_USER);
        log.info("Saving new user, email:{}", userEmail);
        return true;

    }

}
