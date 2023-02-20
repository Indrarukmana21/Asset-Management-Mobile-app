package com.example.applicationassetlist;

public class Asset {
    private String name;
    private String description;
    private int image;
    private String category;

    public Asset(String name, String description, int image, String category) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }
}
