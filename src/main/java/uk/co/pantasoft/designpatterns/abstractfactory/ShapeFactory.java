package uk.co.pantasoft.designpatterns.abstractfactory;

import uk.co.pantasoft.designpatterns.abstractfactory.color.Color;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Circle;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Rectangle;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Shape;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Square;

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