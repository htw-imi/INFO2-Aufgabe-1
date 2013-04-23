package com.u1.rectangles;

/**
 * Created by: Stefan Kaufhold
 * Date: 22.04.13
 */
public class Rectangle extends Square implements RectangleInterface {
    protected double height;

    public Rectangle(double w, double h) {
        super(w);
        height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getEdgeLength() {
        return 2 * width + 2 * height;
    }
}
