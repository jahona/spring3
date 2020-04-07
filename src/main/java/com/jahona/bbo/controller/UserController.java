package com.jahona.bbo.controller;

import com.jahona.bbo.dto.user.User;
import com.jahona.bbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public @ResponseBody
    List<User> getUserList() throws Exception {
        List<User> list = userService.getUserList();

        return list;
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public @ResponseBody
    User createUser(@RequestBody User user) throws Exception {
        User newUser = userService.createUser(user);

        return newUser;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public @ResponseBody
    User getUser(@PathVariable(value = "id") int id) throws Exception {
        User selectUser = userService.getUser(id);

        return selectUser;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public @ResponseBody
    User updateUser(@PathVariable(value = "id") int id, @RequestBody User user) throws Exception {
        user.setId(id);
        User selectUser = userService.updateUser(user);

        return selectUser;
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseEntity deleteUser(@PathVariable(value = "id") int id) throws Exception {
        Map<String, Object> map = userService.deleteUser(id);

        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }
}