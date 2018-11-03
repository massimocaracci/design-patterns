package uk.co.pantasoft.designpatterns.factorymethod;

import org.junit.Test;

public class ShapeFactoryLegacyTest {

    @Test
    public void getShape() {

        ShapeFactoryLegacy shapeFactory = new ShapeFactoryLegacy();

        var shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        var shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}