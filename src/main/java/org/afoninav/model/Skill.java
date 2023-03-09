package org.afoninav.model;

public class Skill {

    private Long id;

    private String title;

    public Skill() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkill() {
        return title;
    }

    public void setSkill(String skill) {
        this.title = skill;
    }
}