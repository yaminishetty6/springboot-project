package com.example.babymedicine;

public class Medicine {

    private Long id;
    private String name;
    private String purpose;
    private String form;
    private String expiryDate;

    public Medicine() {
    }

    public Medicine(Long id,
                    String name,
                    String purpose,
                    String form,
                    String expiryDate) {

        this.id = id;
        this.name = name;
        this.purpose = purpose;
        this.form = form;
        this.expiryDate = expiryDate;
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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
