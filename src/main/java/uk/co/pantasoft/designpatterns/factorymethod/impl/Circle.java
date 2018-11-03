package uk.co.pantasoft.designpatterns.factorymethod.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.pantasoft.designpatterns.factorymethod.Shape;

public class Circle implements Shape {

    private static final Logger LOGGER = LoggerFactory.getLogger(Shape.class);

    @Override
    public void draw() {

        LOGGER.info("Circle.draw");
    }
}
