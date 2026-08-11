package com.example.babymedicine;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    private final List<Prescription> prescriptions = new ArrayList<>();

    private long nextId = 1;

    @GetMapping
    public List<Prescription> getAllPrescriptions() {
        return prescriptions;
    }

    @GetMapping("/{id}")
    public Prescription getPrescription(@PathVariable Long id) {

        return prescriptions.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/baby/{babyId}")
    public List<Prescription> getBabyPrescriptions(
            @PathVariable Long babyId) {

        return prescriptions.stream()
                .filter(p -> p.getBabyId().equals(babyId))
                .toList();
    }

    @PostMapping
    public Prescription addPrescription(
            @RequestBody Prescription prescription) {

        prescription.setId(nextId++);
        prescriptions.add(prescription);

        return prescription;
    }

    @DeleteMapping("/{id}")
    public String deletePrescription(@PathVariable Long id) {

        boolean removed = prescriptions.removeIf(
                p -> p.getId().equals(id)
        );

        if (removed) {
            return "Prescription record deleted successfully";
        }

        return "Prescription not found";
    }
