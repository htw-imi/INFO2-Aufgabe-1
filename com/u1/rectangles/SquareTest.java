package com.u1.rectangles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by: Stefan Kaufhold
 * Date: 23.04.13
 */
public class SquareTest {
    RectangleInterface sqr;
    @Before
    public void setUp() throws Exception {
        sqr = new Square(3);
    }
    @Test
    public void testGetArea() throws Exception {
        assertEquals(9, sqr.getArea(), 1e-15);
    }

    @Test
    public void testGetEdgeLength() throws Exception {
        assertEquals(12, sqr.getEdgeLength(), 1e-15);
    }
}
