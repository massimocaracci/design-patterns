package com.pantasoft.designpatterns.factorymethod;

import static org.junit.Assert.*;

import com.pantasoft.designpatterns.factorymethod.*;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Created by massimo.caracci on 30/05/2017.
 */
public class ShapeFactoryTest {
    ShapeFactory shapeFactory;

    @Before
    public void setUp(){
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void testShapeTypeCIRCLE() {
        Shape shape = shapeFactory.getShape("CIRCLE");
        assertThat(shape, instanceOf(Circle.class));
        assertEquals("Draw a Circle.",shape.draw());
    }

    @Test
    public void testShapeTypeRECTANGLE() {
        Shape shape = shapeFactory.getShape("RECTANGLE");

        assertThat(shape, instanceOf(Rectangle.class));
        assertEquals("Draw a Rectangle.",shape.draw());
    }

    @Test
    public void testShapeTypeSQUARE() {
        Shape shape = shapeFactory.getShape("SQUARE");

        assertThat(shape, instanceOf(Square.class));
        assertEquals("Draw a Square.",shape.draw());
    }
}
