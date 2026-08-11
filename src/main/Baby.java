package com.example.babymedicine;

public class Baby {

    private Long id;
    private String name;
    private int ageInMonths;
    private String allergies;
    private String parentName;
    private String emergencyContact;

    public Baby() {
    }

    public Baby(Long id,
                String name,
                int ageInMonths,
                String allergies,
                String parentName,
                String emergencyContact) {

        this.id = id;
        this.name = name;
        this.ageInMonths = ageInMonths;
        this.allergies = allergies;
        this.parentName = parentName;
        this.emergencyContact = emergencyContact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
}
