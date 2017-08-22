package com.example.a1.tmap;

import java.io.Serializable;

public class listItem implements Serializable {
    private String name;  // 주소
    private String address;   // 상세주소
    private Double lat;
    private Double lon;

    public listItem(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public listItem(String name, String address, Double lat, Double lon) {
        this.name = name;
        this.address = address;
        this.lat = lat;
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }



}

