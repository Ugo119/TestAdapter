package com.example.ugo.testadapter;

public class Modified {
    public String description;
    public int imageResource;

    public Modified(String description, int imageResource) {
        this.description = description;
        this.imageResource = imageResource;
    }
    public String getText(){return description;}
    public int getImage(){return imageResource;}

}
