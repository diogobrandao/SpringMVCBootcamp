package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.MockUserService;
import org.academiadecodigo.bootcamp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;



@Controller
@SessionAttributes("user")
public class UserController {

    @Autowired
    private MockUserService us;

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public String showUserList(Model model, @ModelAttribute("editUser") User user) {
        model.addAttribute("users", us.getAllUsers());
        model.addAttribute("userInfo", new User());
        model.addAttribute("editUser", user);
        return "users";
    }


    @RequestMapping(method = RequestMethod.POST, value = "/users/add")
    public String addUser(Model model, @Valid @ModelAttribute("userInfo") User user, BindingResult bindingResult){
        us.addUser(user);
        return "redirect:/users";
        }

    /*
    @RequestMapping(method = RequestMethod.DELETE, value = "/users/add")
    public String addUser(Model model, @Valid @ModelAttribute("user") BindingResult bindingResult){
        us.getAllUsers().clear();
        return "redirect:/users";
    }*/

    @RequestMapping(method = RequestMethod.GET, value = "/users/remove/{username}")
    public String deleteUser(Model model, @PathVariable("username") String username){

        User user = us.getUsers().get(username);
        us.removeUser(user);
        return "redirect:/users";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users/edit/{username}")
    public String editUser(Model model, @PathVariable("username") String username, RedirectAttributes redirectAttributes){
       User user = us.findbyName(username);
       redirectAttributes.addFlashAttribute("editUser", user);
       return "redirect:/users";

    }

    }




