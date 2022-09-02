package br.gov.sp.ferrazdevasconcelos.protocolmanager.service;

import br.gov.sp.ferrazdevasconcelos.protocolmanager.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.ferrazdevasconcelos.protocolmanager.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getUser(User user) {
        return userRepository.find(user);
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "user removed !! " + id;
    }

    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setQuantity(user.getQuantity());
        existingUser.setPrice(user.getPrice());
        return userRepository.save(existingUser);
    }
    
}
