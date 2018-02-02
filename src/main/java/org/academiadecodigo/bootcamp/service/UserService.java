package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {


    boolean authenticate(String username, String password);

    void addUser(User user);


    List<User> getAllUsers();

    User findbyName(String username);

    User findbyId(Integer id);

    void removeUser(User user);

    void removeUserById(Integer id);

    Integer count();


}
