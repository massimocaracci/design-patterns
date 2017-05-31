package com.pantasoft.designpatterns.abstractfactory;

import com.pantasoft.designpatterns.abstractfactory.color.Color;
import com.pantasoft.designpatterns.abstractfactory.shape.Shape;

/**
 * Created by massimo.caracci on 30/05/2017.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
