package org.academiadecodigo.bootcamp.api;

import org.academiadecodigo.bootcamp.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldController {



    @RequestMapping(method = RequestMethod.GET, value = "/api/hello")
    public ResponseEntity<Message> hellowWorld2(@RequestParam(value = "username", defaultValue = "World") String str){

        Message message = new Message();
        message.setMessage("Hello  "+ str);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
