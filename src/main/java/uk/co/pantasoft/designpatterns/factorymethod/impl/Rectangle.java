package uk.co.pantasoft.designpatterns.factorymethod.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.pantasoft.designpatterns.factorymethod.Shape;

public class Rectangle implements Shape {

    private static final Logger LOGGER = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() {

        LOGGER.info("Rectangle.draw");
    }
}
