package com.example.mongodbtests.drugiCase.controller;

import com.example.mongodbtests.drugiCase.models.Hotel;
import com.example.mongodbtests.drugiCase.repo.HotelRepository;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Holder;
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
