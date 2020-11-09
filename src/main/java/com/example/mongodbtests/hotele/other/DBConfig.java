package com.example.mongodbtests.hotele.other;

import com.example.mongodbtests.hotele.models.Address;
import com.example.mongodbtests.hotele.models.Hotel;
import com.example.mongodbtests.hotele.models.Review;
import com.example.mongodbtests.hotele.repo.HotelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DBConfig implements CommandLineRunner {
    private final HotelRepository repo;

    public DBConfig(HotelRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel(
                "Marriot",
                130,
                new Address("Wroclaw", "Poland"),
                Arrays.asList(
                        new Review("Janis", 8, false),
                        new Review("marian", 3, true)
                )
        );

        Hotel ibis = new Hotel(
                "Ibis",
                30,
                new Address("Poznan", "Poland"),
                Arrays.asList(
                        new Review("Marian", 8, true)
                )
        );
        Hotel sofitel = new Hotel(
                "Sofitel",
                530,
                new Address("Warsaw", "Poland"),
                new ArrayList<>()
        );
        repo.deleteAll();
        List<Hotel> hotels = Arrays.asList(sofitel,ibis,marriot);
        repo.saveAll(hotels);

    }
}
