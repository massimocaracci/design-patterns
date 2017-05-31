package com.pantasoft.designpatterns.factorymethod;

/**
 * Created by massimo.caracci on 30/05/2017.
 */
enum ShapeType {
    CIRCLE, RECTANGLE, SQUARE
}

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();

            case RECTANGLE:
                return new Rectangle();

            case SQUARE:
                return new Square();

            default:
                break;
        }
        return null;
    }
}

