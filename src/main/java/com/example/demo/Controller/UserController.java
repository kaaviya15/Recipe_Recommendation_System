package com.example.demo.Controller;

import ch.qos.logback.core.model.Model;
import com.example.demo.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

@GetMapping("/")
    public String register(Model model){
        User user=new User();
        return "user";
    }
    @PostMapping("/{user}")
    public User save(@RequestBody User updatedUser) {
                return updatedUser;
            }
    @PutMapping(value = "/update/{user_id}")
    public String update(@PathVariable("id") int user_id, @RequestBody User user) {

        return "User updated successfully";
    }
    @DeleteMapping(value = "/delete/{user_id}")
    public String delete(@PathVariable("id") int user_Id) {
        return "User delete from database.";
    }
        }

