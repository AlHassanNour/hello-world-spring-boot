package de.htwberlin.webtech.web.api;

import de.htwberlin.webtech.persistence.Gender;

import java.util.List;

public class Contact {

    private int id;
    private String firstName;
    private String secondName;
    private String work;
    private String email;
    private String phone;
    private String gender;


    public Contact(int id, String firstName, String secondName, String work, String email, String phone, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.work = work;
        this.email = email;
        this.phone = phone;
        this.gender=gender;
    }

    public Contact(int id, String nour, String al_hassan, String student, String email, String phone, String female, List<Object> emptyList) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
