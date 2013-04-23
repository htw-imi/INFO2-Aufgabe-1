package com.u1.rectangles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by: Stefan Kaufhold
 * Date: 23.04.13
 */
public class RectangleTest {
    private RectangleInterface rect;
    @Before
    public void setUp() throws Exception {
        rect = new Rectangle(2, 3);
    }

    @Test
    public void testGetArea() throws Exception {
        assertEquals("Area", 6.0, rect.getArea(), .000001);
    }

    @Test
    public void testGetEdgeLength() throws Exception {
        assertEquals("Edge Length", 10, rect.getEdgeLength(), .000001);
    }
}
