package com.example.td6.models;

import com.example.td6.activities.UserActivity;

public class Repos {
    private int id;
    private String name;
    private String fullName;
    private String url;
    private int issues;
    private String language;
    private UserActivity owner;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String geturl() {
        return url;
    }

    public void seturl(String url) {
        this.url = url;
    }

    public int getissues() {
        return issues;
    }

    public void setissues(int issues) {
        this.issues = issues;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public UserActivity getOwner() {
        return owner;
    }

    public void setOwner(UserActivity owner) {
        this.owner = owner;
    }
}
