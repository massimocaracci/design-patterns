package uk.co.pantasoft.designpatterns.abstractfactory;

import org.junit.Before;
import org.junit.Test;
import uk.co.pantasoft.designpatterns.abstractfactory.color.Blue;
import uk.co.pantasoft.designpatterns.abstractfactory.color.Color;
import uk.co.pantasoft.designpatterns.abstractfactory.color.Green;
import uk.co.pantasoft.designpatterns.abstractfactory.color.Red;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Circle;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Rectangle;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Shape;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Square;

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
    public void setUp() {
        shapeFactory = FactoryProducer.getFactory("SHAPE");
        colorFactory = FactoryProducer.getFactory("COLOR");
    }

    /**
     * Color Tests
     **/
    @Test
    public void testColorRed() {
        Color color = colorFactory.getColor("RED");
        assertThat(color, instanceOf(Red.class));
        assertEquals("Fill color Red.", color.fill());
    }

    @Test
    public void testColorGreen() {
        Color color = colorFactory.getColor("GREEN");
        assertThat(color, instanceOf(Green.class));
        assertEquals("Fill color Green.", color.fill());
    }

    @Test
    public void testColorBlue() {
        Color color = colorFactory.getColor("BLUE");
        assertThat(color, instanceOf(Blue.class));
        assertEquals("Fill color Blue.", color.fill());
    }

    /**
     * Shape Tests
     **/
    @Test
    public void testShapeTypeCIRCLE() {
        Shape shape = shapeFactory.getShape("CIRCLE");
        assertThat(shape, instanceOf(Circle.class));
        assertEquals("Draw a Circle.", shape.draw());
    }

    @Test
    public void testShapeTypeRECTANGLE() {
        Shape shape = shapeFactory.getShape("RECTANGLE");

        assertThat(shape, instanceOf(Rectangle.class));
        assertEquals("Draw a Rectangle.", shape.draw());
    }

    @Test
    public void testShapeTypeSQUARE() {
        Shape shape = shapeFactory.getShape("SQUARE");

        assertThat(shape, instanceOf(Square.class));
        assertEquals("Draw a Square.", shape.draw());
    }
}