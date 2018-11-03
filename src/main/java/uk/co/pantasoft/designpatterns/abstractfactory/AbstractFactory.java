package uk.co.pantasoft.designpatterns.abstractfactory;

import uk.co.pantasoft.designpatterns.abstractfactory.color.Color;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Shape;

/**
 * Created by massimo.caracci on 30/05/2017.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
