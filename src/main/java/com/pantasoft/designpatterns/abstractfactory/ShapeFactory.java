package com.pantasoft.designpatterns.abstractfactory;

import com.pantasoft.designpatterns.abstractfactory.color.*;
import com.pantasoft.designpatterns.abstractfactory.shape.*;

/**
 * Created by massimo.caracci on 30/05/2017.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
   public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}