package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.service.BootcampService;
import org.academiadecodigo.bootcamp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class MainController {

    @Autowired
    private UserService us;
    @Autowired
    private BootcampService bs;

    /*@RequestMapping(method = RequestMethod.GET, value = "/main")
        public ModelAndView showMain(){
        ModelAndView modelAndView = new ModelAndView("main");
        return modelAndView;
    }*/



    @RequestMapping(method = RequestMethod.GET, value = "/main")
        public  String showList(Model model){
            model.addAttribute("bootcampList", bs.getAllBootcamps());
            return "main";

    }


}
