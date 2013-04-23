package com.u1.rectangles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by: Stefan Kaufhold
 * Date: 23.04.13
 */
public class RectangleInterfaceTest {

    @Test
    public void testPolymorphism() throws Exception {
        RectangleInterface rect1 = new Square(2);
        RectangleInterface rect2 = new Rectangle(2, 2);
        assertEquals(4, rect1.getArea(), .00000000001);
        assertEquals(4, rect2.getArea(), .00000000001);
    }
}
