package com.pantasoft.designpatterns.abstractfactory;

import com.pantasoft.designpatterns.abstractfactory.AbstractFactory;
import com.pantasoft.designpatterns.abstractfactory.FactoryProducer;
import com.pantasoft.designpatterns.abstractfactory.color.Blue;
import com.pantasoft.designpatterns.abstractfactory.color.Color;
import com.pantasoft.designpatterns.abstractfactory.color.Green;
import com.pantasoft.designpatterns.abstractfactory.color.Red;
import com.pantasoft.designpatterns.abstractfactory.shape.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by massimo.caracci on 30/05/2017.
 */
public class AbstractFactoryTest {
    AbstractFactory shapeFactory;
    AbstractFactory colorFactory;

    @Before
    public void setUp(){
        shapeFactory = FactoryProducer.getFactory("SHAPE");
        colorFactory = FactoryProducer.getFactory("COLOR");
    }

    /** Color Tests **/
    @Test
    public void testColorRed() {
        Color color = colorFactory.getColor("RED");
        assertThat(color, instanceOf(Red.class));
        assertEquals("Fill color Red.",color.fill());
    }

    @Test
    public void testColorGreen() {
        Color color = colorFactory.getColor("GREEN");
        assertThat(color, instanceOf(Green.class));
        assertEquals("Fill color Green.",color.fill());
    }

    @Test
    public void testColorBlue() {
        Color color = colorFactory.getColor("BLUE");
        assertThat(color, instanceOf(Blue.class));
        assertEquals("Fill color Blue.",color.fill());
    }

    /** Shape Tests **/
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