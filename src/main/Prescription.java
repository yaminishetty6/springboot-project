package com.example.babymedicine;

public class Prescription {

    private Long id;
    private Long babyId;
    private Long medicineId;

    private String instructions;
    private String startDate;
    private String endDate;
    private String frequency;

    public Prescription() {
    }

    public Prescription(Long id,
                         Long babyId,
                         Long medicineId,
                         String instructions,
                         String startDate,
                         String endDate,
                         String frequency) {

        this.id = id;
        this.babyId = babyId;
        this.medicineId = medicineId;
        this.instructions = instructions;
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBabyId() {
        return babyId;
    }

    public void setBabyId(Long babyId) {
        this.babyId = babyId;
    }

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
