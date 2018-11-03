package uk.co.pantasoft.designpatterns.abstractfactory;

import uk.co.pantasoft.designpatterns.abstractfactory.color.Blue;
import uk.co.pantasoft.designpatterns.abstractfactory.color.Color;
import uk.co.pantasoft.designpatterns.abstractfactory.color.Green;
import uk.co.pantasoft.designpatterns.abstractfactory.color.Red;
import uk.co.pantasoft.designpatterns.abstractfactory.shape.Shape;

/**
 * Created by massimo.caracci on 30/05/2017.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
