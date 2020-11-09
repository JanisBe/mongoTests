package com.example.mongodbtests.Users;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Ctrl {
    private final Repo repo;

    public Ctrl(Repo repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return repo.findAll();
    }

    @PostMapping(
            value = "/save", consumes = "application/json", produces = "application/json")
    public User saveUser(@RequestBody User user) {
        return repo.save(user);
    }
}
