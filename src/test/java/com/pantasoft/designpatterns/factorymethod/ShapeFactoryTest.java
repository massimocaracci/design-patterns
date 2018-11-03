package com.pantasoft.designpatterns.factorymethod;

import org.junit.Test;

import java.util.function.Supplier;

public class ShapeFactoryTest {

    @Test
    public void getShape() {

        Supplier<ShapeFactory> shapeFactory = ShapeFactory::new;

        shapeFactory.get().getShape("circle").draw();

        shapeFactory.get().getShape("rectangle").draw();
    }
}