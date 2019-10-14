package com.example.personactivity;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String address;
    private String phone;
    private String url;
    private String image;



    public Person(String name, String address, String phone, String image, String url) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.image=image;
        this.url = url;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
