package org.academiadecodigo.bootcamp.api;

import org.academiadecodigo.bootcamp.model.Bootcamp;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.MockBootcampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RestBootCampController {

    @Autowired
    private MockBootcampService bs;

    @RequestMapping(method = RequestMethod.GET, value = "/api/bootcamps")
    public ResponseEntity<List<Bootcamp>> showBootcampList(){
        return new ResponseEntity<>(bs.getAllBootcamps(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/bootcamps/{id}")
    public ResponseEntity<Bootcamp> showBootcamp(@PathVariable("id") Integer id){

        return new ResponseEntity<>(bs.findById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/api/bootcamps/add")
    public ResponseEntity addBootcamp(@Valid @ModelAttribute Bootcamp bootcamp){
        bs.addBootcamp(bootcamp);
        return new ResponseEntity<>(bootcamp, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/api/bootcamps/remove/{id}")
    public ResponseEntity removeBootcamp(@PathVariable Integer id){
        bs.removeBootcamp(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/api/bootcamps/edit/{id}")
    public ResponseEntity editBootcamp(@Valid @PathVariable("id") Integer id, String location, String end, String start){
        Bootcamp bootcamp = bs.findById(id);
        bootcamp.setId(id);
        bootcamp.setEnd(end);
        bootcamp.setStart(start);
        bootcamp.setLocation(location);
        return new ResponseEntity(HttpStatus.OK);
    }



}
