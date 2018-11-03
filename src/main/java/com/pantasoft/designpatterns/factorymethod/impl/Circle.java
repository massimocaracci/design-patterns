package com.pantasoft.designpatterns.factorymethod.impl;

import com.pantasoft.designpatterns.factorymethod.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle implements Shape {

    private static final Logger LOGGER = LoggerFactory.getLogger(Shape.class);

    @Override
    public void draw() {

        LOGGER.info("Circle.draw");
    }
}
