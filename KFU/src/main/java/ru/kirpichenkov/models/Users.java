package ru.kirpichenkov.models;

import java.time.LocalDate;

public class Users {
    private String Name;
    private LocalDate birtDay;
    private String password;

    public Users(String name, LocalDate birtDay, String password) {
        Name = name;
        this.birtDay = birtDay;
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(LocalDate birtDay) {
        this.birtDay = birtDay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
