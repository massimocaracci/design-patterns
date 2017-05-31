package com.pantasoft.designpatterns.abstractfactory;

import com.pantasoft.designpatterns.abstractfactory.AbstractFactory;
import com.pantasoft.designpatterns.abstractfactory.color.*;
import com.pantasoft.designpatterns.abstractfactory.shape.*;

/**
 * Created by massimo.caracci on 30/05/2017.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
