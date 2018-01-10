package com.springapp.mvc.controller;

import com.springapp.mvc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Tian Wang on 2015/3/24.
 */

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    @Qualifier("userService") //this is to specify implementation class
    private IUserService userService;

//    @RequestMapping(value = "/",
//            method = RequestMethod.GET,
//            produces="application/json;charset=UTF-8")
//    public String listUsers(ModelMap model) {
//        model.addAttribute("user", new User());
//        model.addAttribute("users", userService.getAllUsers());
//        return "redirect:/";
//    }
//
//    /**
//     *
//     * @return users in json
//     */
//    @ResponseBody
//    @RequestMapping(value = "/json",
//            method = RequestMethod.GET,
//            produces="application/json;charset=UTF-8")
//    public  List<User> listUsers() {
//        List<User> users = userService.getAllUsers();
//        return users;
//    }

//    @ResponseBody
//    @RequestMapping(value="/getUser",
//            method = RequestMethod.GET,
//            produces="application/json;charset=UTF-8")
//    public User findUser() {
//        User user = userService.getAllUsers().get(0);
//        return user;
//    }

//    @ResponseBody
//    @RequestMapping(value="/getUser",
//            method = RequestMethod.GET)
//    public String findUser() {
//        String name = userService.getAllUsers().get(0).getName();
//        return name;
//    }

    @ResponseBody
    @RequestMapping(value="/getStatus",
            method = RequestMethod.GET)
    public String getStatus() {
        String name = userService.getAllUsers().get(0).getName();
        return name;
    }


//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String addUser(@ModelAttribute("user") User user, BindingResult result) {
//        userService.addUser(user);
//        return "redirect:/";
//    }
//    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.PUT)
//    public String deleteUser(@PathVariable("userId") int userId) {
//        userService.deleteUser(userId);
//        return "redirect:/";
//    }
}
