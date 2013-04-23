package com.u1.rectangles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by: Stefan Kaufhold
 * Date: 23.04.13
 */
public class ShapeInterfaceTest {

    @Test
    public void testPolymorphism() throws Exception {
        ShapeInterface square = new Square(2);
        ShapeInterface rect = new Rectangle(2, 2);
        assertEquals(4, square.getArea(), 1e-15);
        assertEquals(4, rect.getArea(), 1e-15);
    }
}
