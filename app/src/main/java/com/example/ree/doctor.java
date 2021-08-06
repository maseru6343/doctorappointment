package com.example.ree;

public class doctor {

    String Names, Village,Age,Gender,Time,Date;

    public doctor() {

    }

    public doctor(String names, String village, String age, String gender, String time, String date) {
        Names = names;
        Village = village;
        Age = age;
        Gender = gender;
        Time = time;
        Date = date;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        Village = village;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
