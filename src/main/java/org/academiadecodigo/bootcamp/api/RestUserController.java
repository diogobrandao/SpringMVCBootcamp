package org.academiadecodigo.bootcamp.api;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.MockUserService;
import org.academiadecodigo.bootcamp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;

@RestController
public class RestUserController {

    @Autowired
    private MockUserService us;

    @RequestMapping(method = RequestMethod.GET, value = "/api/users")
    public ResponseEntity<List<User>> showUserList() {
        return new ResponseEntity<>(us.getAllUsers(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> showUser(@PathVariable("id") Integer id) {


        return new ResponseEntity<>(us.findbyId(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addUser(@Valid @ModelAttribute User user){
        us.addUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/users/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity removeUser(@PathVariable("id") Integer id){
        us.removeUserById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/api/users/edit/{id}")
    public ResponseEntity editUser(@Valid @PathVariable("id") Integer id, String username, String email, String password){

        User user = us.findbyId(id);

        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}




