package com.vweinert.queue.pusher.services;

import com.vweinert.queue.pusher.entities.User;
import com.vweinert.queue.pusher.queue.Push;
import com.vweinert.queue.pusher.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserPusher {
    private final Push push;
    private final UserRepo userRepo;
    public UserPusher(Push push, UserRepo userRepo) {
        this.push = push;
        this.userRepo = userRepo;
    }
    @Transactional
    public String push(User user) {
        Optional<User> theSameUser = userRepo.findByName(user.getName());
        if (theSameUser.isPresent()) {
            return "User already exists username";
        }
        Optional<User> theSameEmail = userRepo.findByEmail(user.getEmail());
        if (theSameEmail.isPresent()) {
            return "User already exists email";
        }


        return "ok";
    }
}
