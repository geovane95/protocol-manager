package br.gov.sp.ferrazdevasconcelos.protocolmanager.controller;

import br.gov.sp.ferrazdevasconcelos.protocolmanager.model.User;
import br.gov.sp.ferrazdevasconcelos.protocolmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> findAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    @GetMapping
    public List<User> findUser(@RequestBody User user) {
        return service.getUser(user);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }
}