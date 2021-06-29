package com.student.graduationproject.model.number1data;

public class Number1data {
    private String country;

    private Integer totil;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Integer getTotil() {
        return totil;
    }

    public void setTotil(Integer totil) {
        this.totil = totil;
    }
}