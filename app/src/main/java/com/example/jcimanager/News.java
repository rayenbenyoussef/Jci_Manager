package com.example.jcimanager;

public class News {
    private int id;
    private String title;
    private int img;
    private String description;

    private String link;

    public News(int id, String description, int img, String title,String link) {
        this.id = id;
        this.description = description;
        this.img = img;
        this.title = title;
        this.link=link;
    }

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
