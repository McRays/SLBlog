package com.sl.controller;

import com.sl.model.User;
import com.sl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/add", method=RequestMethod.POST)
    @ResponseBody
    public int addUser(@ModelAttribute(value="user") User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }

    @RequestMapping(value = "/del",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public int delUser(User user){
        return userService.delUser(user);
    }

    @RequestMapping(value = "/login")
    public String login(User user){
        return "index";
    }

}
