package com.example.fullstack.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fullstack.Dto.UserDTO;
import com.example.fullstack.Service.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UsuarioController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody UserDTO userDTO) {
        String id = userService.addUser(userDTO);
        return id;
    }
}
