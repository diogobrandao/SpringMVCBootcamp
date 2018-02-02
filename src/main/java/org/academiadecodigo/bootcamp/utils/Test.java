package org.academiadecodigo.bootcamp.utils;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.MockUserService;
import org.academiadecodigo.bootcamp.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        UserService us = new MockUserService();
        Map<String , User> users = new HashMap<String, User>() {{
            put("Diogo", user1);
            put("Rudy", user2);
        }};




        System.out.println(users.size());
    }
}
