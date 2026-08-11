package com.example.babymedicine;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    private final List<Medicine> medicines = new ArrayList<>();

    private long nextId = 1;

    @GetMapping
    public List<Medicine> getAllMedicines() {
        return medicines;
    }

    @GetMapping("/{id}")
    public Medicine getMedicine(@PathVariable Long id) {

        return medicines.stream()
                .filter(medicine -> medicine.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Medicine addMedicine(@RequestBody Medicine medicine) {

        medicine.setId(nextId++);
        medicines.add(medicine);

        return medicine;
    }

    @DeleteMapping("/{id}")
    public String deleteMedicine(@PathVariable Long id) {

        boolean removed = medicines.removeIf(
                medicine -> medicine.getId().equals(id)
        );

        if (removed) {
            return "Medicine information deleted successfully";
        }

        return "Medicine not found";
    }
