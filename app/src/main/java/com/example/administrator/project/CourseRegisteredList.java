package com.example.administrator.project;

public class CourseRegisteredList {
    String st_phone;
    String st_timing;
    String st_day;
    String uid;

    public CourseRegisteredList(String st_phone, String st_timing, String st_day, String uid) {
        this.st_phone = st_phone;
        this.st_timing = st_timing;
        this.st_day = st_day;
        this.uid = uid;
    }

    public String getSt_phone() {
        return st_phone;
    }

    public void setSt_phone(String st_phone) {
        this.st_phone = st_phone;
    }

    public String getSt_timing() {
        return st_timing;
    }

    public void setSt_timing(String st_timing) {
        this.st_timing = st_timing;
    }

    public String getSt_day() {
        return st_day;
    }

    public void setSt_day(String st_day) {
        this.st_day = st_day;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
