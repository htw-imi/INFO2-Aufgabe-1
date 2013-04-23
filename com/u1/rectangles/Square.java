package com.u1.rectangles;

/**
 * Created by: Stefan Kaufhold
 * Date: 22.04.13
 */
public class Square implements SquareInterface {
    protected double width;

    public Square(double size) {
        width = size;
    }

    public double getArea() {
        return width * width;
    }

    public double getEdgeLength() {
        return 4 * width;
    }
}
