package com.pantasoft.designpatterns.abstractfactory.shape;

/**
 * Created by massimo.caracci on 30/05/2017.
 */
public class Rectangle implements Shape {

    @Override
    public String draw() {
        return "Draw a Rectangle.";
    }
}
