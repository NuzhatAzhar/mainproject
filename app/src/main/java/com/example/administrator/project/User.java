package com.example.administrator.project;

public class User {

    String image;
    String pass;
    String uname;
    String email;
    String contact;

    public User() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public User(String image, String pass, String uname, String email, String contact) {
        this.image = image;
        this.pass = pass;
        this.uname = uname;
        this.email = email;
        this.contact = contact;

    }
}
