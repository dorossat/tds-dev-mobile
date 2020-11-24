package com.example.td4;

import android.app.Application;

public class SettingsActivity extends Application {
    private String username = "hamza@hramchi.com";
    private String password = "hamza9623";
    private String login;

    @Override
    public void onCreate() {
        super.onCreate();
        this.login = null;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}