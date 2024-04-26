package ru.Spring_Boot_312.demo.service;



import ru.Spring_Boot_312.demo.model.User;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();
    User findUserById(long id);
    void createUser(User user);
    void updateUser(long id, User user);
    void deleteUser(long id);
}
