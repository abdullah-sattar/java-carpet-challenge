package com.company;

public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        if (length < 0) {
            this.length = 0;
            this.width = width;
        } else if (width < 0) {
            this.width = 0;
            this.length = length;
        } else if (width < 0) {
            this.width = 0;
            this.length = length;
        } else {
            this.length = length;
            this.width = width;
        }
    }

    public double getArea() {
       return this.length*this.width;
    }
}
