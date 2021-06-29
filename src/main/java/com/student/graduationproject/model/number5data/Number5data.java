package com.student.graduationproject.model.number5data;

public class Number5data {
    private String bmi;

    private String pts;

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi == null ? null : bmi.trim();
    }

    public String getPts() {
        return pts;
    }

    public void setPts(String pts) {
        this.pts = pts == null ? null : pts.trim();
    }
}