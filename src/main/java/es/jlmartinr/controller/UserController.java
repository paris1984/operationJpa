package es.jlmartinr.controller;

import es.jlmartinr.entity.User;
import es.jlmartinr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public Boolean saveUser(@RequestBody @Valid User user) {

        userService.save(user);
        return true;
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userService.list();

    }
}
