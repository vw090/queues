package com.vweinert.queue.pusher.controller;

import com.vweinert.queue.pusher.entities.User;
import com.vweinert.queue.pusher.services.UserPusher;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserPusher userPusher;
    public UserController(UserPusher userPusher){
        this.userPusher = userPusher;
    }
    @PostMapping("/")
    public String createUser(@RequestBody User user) {
        return userPusher.push(user);
    }
}
