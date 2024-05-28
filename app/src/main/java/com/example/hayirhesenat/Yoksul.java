package com.example.hayirhesenat;

import java.util.ArrayList;

public class Yoksul {
    private String name;
    private String surName;
    private String iL;
    private String ilce;
    private String mahalle;
    private String sokak;
    private String apartman;
    private String kapiNo;
    private String tc;
    private String password;
    private int gelir;
    private int aileKisi;
    private int cocukSayisi;
    public ArrayList<String> egitimdurumu = new ArrayList<>();
    private int aylikHarcama;
    private String destekTuru;


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

    public String getiL() {
        return iL;
    }

    public void setiL(String iL) {
        this.iL = iL;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getApartman() {
        return apartman;
    }

    public void setApartman(String apartman) {
        this.apartman = apartman;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGelir() {
        return gelir;
    }

    public void setGelir(int gelir) {
        this.gelir = gelir;
    }

    public int getAileKisi() {
        return aileKisi;
    }

    public void setAileKisi(int aileKisi) {
        this.aileKisi = aileKisi;
    }

    public int getCocukSayisi() {
        return cocukSayisi;
    }

    public void setCocukSayisi(int cocukSayisi) {
        this.cocukSayisi = cocukSayisi;
    }



    public int getAylikHarcama() {
        return aylikHarcama;
    }

    public void setAylikHarcama(int aylikHarcama) {
        this.aylikHarcama = aylikHarcama;
    }

    public String getDestekTuru() {
        return destekTuru;
    }

    public void setDestekTuru(String destekTuru) {
        this.destekTuru = destekTuru;
    }
}
