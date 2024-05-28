package com.example.hayirhesenat;

public class Admin {
    private String name;
    private String surName;
    private String password;
    private String tc;

    public Admin(String name, String surName, String password, String tc) {
        this.name = name;
        this.surName = surName;
        this.password = password;
        this.tc = tc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }
}
