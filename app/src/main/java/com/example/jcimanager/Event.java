package com.example.jcimanager;

import java.time.LocalDate;

public class Event {
    private int id;
    private int img;
    private int cover;
    private String title;
    private String description;
    private LocalDate date;
    private String locationTitle;
    private String locationLink;
    private int max_part;
    private  float paymentAmount;

    public Event(int id, float paymentAmount, int max_part, String locationLink, String locationTitle, LocalDate date, String description, String title, int img) {
        this.id = id;
        this.paymentAmount = paymentAmount;
        this.max_part = max_part;
        this.locationLink = locationLink;
        this.locationTitle = locationTitle;
        this.date = date;
        this.description = description;
        this.title = title;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocationLink() {
        return locationLink;
    }

    public void setLocationLink(String locationLink) {
        this.locationLink = locationLink;
    }

    public String getLocationTitle() {
        return locationTitle;
    }

    public void setLocationTitle(String locationTitle) {
        this.locationTitle = locationTitle;
    }

    public int getMax_part() {
        return max_part;
    }

    public void setMax_part(int max_part) {
        this.max_part = max_part;
    }

    public float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
