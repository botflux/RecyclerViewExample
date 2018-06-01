package com.example.victo.listviewapplication;

/**
 * Created by victor.mendele on 01/06/2018.
 */

public class Element {
    private String title;
    private String description;

    public Element (String title, String description) {
        this.title = title;
        this.description = description;
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
}
