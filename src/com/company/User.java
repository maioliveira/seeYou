package com.company;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public boolean login() {

        String Maiza = "Maiza";

        return name.equals(Maiza);
    }
}
