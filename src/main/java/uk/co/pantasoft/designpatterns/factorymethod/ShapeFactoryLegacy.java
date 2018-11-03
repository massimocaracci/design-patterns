package uk.co.pantasoft.designpatterns.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.pantasoft.designpatterns.factorymethod.impl.Circle;
import uk.co.pantasoft.designpatterns.factorymethod.impl.Rectangle;

public class ShapeFactoryLegacy {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShapeFactoryLegacy.class);

    public Shape getShape(String shapeType) {

        if (shapeType == null) {

            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {

            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {

            return new Rectangle();
        }

        return null;
    }
}
