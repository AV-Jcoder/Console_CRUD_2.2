package org.afoninav.model;

public class Specialty {

    private Long id;

    private String title;

    public Specialty() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecialty() {
        return title;
    }

    public void setSpecialty(String specialty) {
        this.title = specialty;
    }
}
