package com.example.database;

import androidx.annotation.NonNull;

public class User {

    private String name;
    private String Phone;

    public User(String name, String phone) {
        this.name = name;
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
