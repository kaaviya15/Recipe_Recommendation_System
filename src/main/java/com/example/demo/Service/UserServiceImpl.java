package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo repo;
    @Override
    public void registeruser(User user){
        repo.save(user);
    }
}
