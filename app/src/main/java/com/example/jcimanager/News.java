package com.example.jcimanager;

public class News {
    private int id;
    private String title;
    private int img;
    private String description;

    public News(int id, String description, int img, String title) {
        this.id = id;
        this.description = description;
        this.img = img;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
