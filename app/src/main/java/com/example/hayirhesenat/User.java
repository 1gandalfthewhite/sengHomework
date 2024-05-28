package com.example.hayirhesenat;

import java.util.ArrayList;

public class User {
    ArrayList<Admin> admins;
    ArrayList<Doner> doners;
    ArrayList<Gonullu> gonullus;
    ArrayList<Yoksul> yoksuls;

    public void addAdmins(Admin admin) {
        admins.add(admin);
    }

    public void addDoners(Doner doner) {
        doners.add(doner);
    }

    public void addGonullu(Gonullu gonullu) {
        gonullus.add(gonullu);
    }

    public void addYoksul(Yoksul yoksul) {
        yoksuls.add(yoksul);
    }
    public void removeAdmins(Admin admin) {
        admins.remove(admin);
    }
    public void  removeDoners(Doner doner) {
        doners.remove(doner);
    }
    public void removeGonullu(Gonullu gonullu) {
        gonullus.remove(gonullu);
    }
    public void removeYoksul(Yoksul yoksul) {
        yoksuls.remove(yoksul);
    }
    public User() {
        admins = new ArrayList<>();
        gonullus = new ArrayList<>();
        yoksuls = new ArrayList<>();
        doners = new ArrayList<>();
    }
}
