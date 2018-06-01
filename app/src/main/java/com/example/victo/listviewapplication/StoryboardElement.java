package com.example.victo.listviewapplication;

/**
 * Created by victor.mendele on 01/06/2018.
 */

public class StoryboardElement {
    private int red;
    private int green;
    private int blue;
    private double time;

    public StoryboardElement (int red, int green, int blue, double time) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.time = time;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
