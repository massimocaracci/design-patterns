package com.pantasoft.designpatterns.factorymethod;

import com.pantasoft.designpatterns.factorymethod.impl.Circle;
import com.pantasoft.designpatterns.factorymethod.impl.Rectangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
