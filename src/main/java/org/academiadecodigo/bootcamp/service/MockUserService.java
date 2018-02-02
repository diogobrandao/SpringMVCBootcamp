package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.utils.Security;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MockUserService implements UserService {

    private Map<Integer, User> users;



    @Override
    public boolean authenticate(String username, String password) {
        return users.containsKey(username) &&
                users.get(username).getPassword().equals(password);
    }

    @Override
    public void addUser(User user) {
        user.setId(count()+1);
        users.put(user.getId(), user);
    }



    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    @Override
    public User findbyName(String username) {
        return users.get(username);
    }

    @Override
    public User findbyId(Integer id) {
        return users.get(id);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user.getUsername());
    }

    @Override
    public void removeUserById(Integer id) {
        users.remove(id);
    }


    @Override
    public Integer count() {
        return users.size();
    }

    public void setUsers(Map<Integer, User> users) {
        this.users = users;
    }
}
