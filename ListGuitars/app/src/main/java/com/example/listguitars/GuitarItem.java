package com.example.listguitars;

public class GuitarItem {
    String name;
    int imageResId;

    public GuitarItem(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}
