package com.example.babymedicine;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/babies")
public class BabyController {

    private final List<Baby> babies = new ArrayList<>();

    private long nextId = 1;

    @GetMapping
    public List<Baby> getAllBabies() {
        return babies;
    }

    @GetMapping("/{id}")
    public Baby getBaby(@PathVariable Long id) {

        return babies.stream()
                .filter(baby -> baby.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Baby createBaby(@RequestBody Baby baby) {

        baby.setId(nextId++);
        babies.add(baby);

        return baby;
    }

    @DeleteMapping("/{id}")
    public String deleteBaby(@PathVariable Long id) {

        boolean removed = babies.removeIf(
                baby -> baby.getId().equals(id)
        );

        if (removed) {
            return "Baby profile deleted successfully";
        }

        return "Baby profile not found";
    }
}
