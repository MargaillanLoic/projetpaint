package com.company;

import java.awt.*;

public class Circle extends Figure{

    public Circle(Integer px,Integer py, Color c) {
        super(c, new Point(px,py));
    }


    @Override
    public void setBoundingBox(Integer width, Integer length) { //methode qui définit les valeurs de width et length
        super.setBoundingBox(width,width);

    }
    public void draw(Graphics g) {

    }
}