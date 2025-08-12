package com.example.listguitarsplus;

public class GuitarItem {
    String name;
    int imageResId;
    String description;

    public GuitarItem(String name, int imageResId, String description) {
        this.name = name;
        this.imageResId = imageResId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }
}