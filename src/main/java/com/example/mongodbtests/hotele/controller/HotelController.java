package com.example.mongodbtests.hotele.controller;

import com.example.mongodbtests.hotele.models.Hotel;
import com.example.mongodbtests.hotele.repo.HotelRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private final HotelRepository repo;

    public HotelController(HotelRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<Hotel> getAll() {
        return repo.findAll();
    }

    @PutMapping
    public Hotel insert(@RequestBody Hotel hotel) {
        return repo.insert(hotel);
    }

    @PostMapping
    public Hotel update(@RequestBody Hotel hotel) {
        return repo.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        repo.deleteById(id);
    }

    @GetMapping("/{name}")
    public Hotel getByName(@PathVariable("name") String name) {
        return repo.findByName(name);
    }
}
