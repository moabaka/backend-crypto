package com.example.fullstack.Service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.fullstack.Dto.LoginDTO;
import com.example.fullstack.Dto.UserDTO;
import com.example.fullstack.Entity.User;
import com.example.fullstack.Repo.UserRepo;
import com.example.fullstack.Service.UserService;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDTO) {
        User user = new User(
            userDTO.getUserid(),
            userDTO.getUsername(),
            userDTO.getApellido(),
            userDTO.getPassword(),
            userDTO.getCountry(),
            userDTO.getCity(),
            userDTO.getDireccion(),
            userDTO.getTipo_de_cuenta(),
            userDTO.getCard_number(),
            userDTO.getExpired(),
            userDTO.getCvv()
        );
        userRepo.save(user);
        return user.getUsername();
    }

    @Override
    public LoginMessage loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginMessage("Login Success", true);
                } else {
                    return new LoginMessage("Login Failed", false);
                }
            } else {
                return new LoginMessage("Password Not Match", false);
            }
        } else {
            return new LoginMessage("Email not exists", false);
        }
    }
}
