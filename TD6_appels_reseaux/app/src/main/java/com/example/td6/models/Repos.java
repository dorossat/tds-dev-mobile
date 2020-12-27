package com.example.td6.models;


public class Repos {
    private String name;
    private String fullName;
    private String language;
    private String url;
    private String commits;
    private int issues;
    private int id;

    private UserRepos owner;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName()
    {
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

    public UserRepos getOwner() {
        return owner;
    }

    public void setOwner(UserRepos owner) {
        this.owner = owner;
    }

    public String getCommits() {
        return this.commits;
    }

    public void setCommits(String commits) {
        this.commits = commits;
    }
}
