package com.company;

import java.awt.*;

public class Square extends Figure{

    public void setWidth(Integer getLength) {
    }

    public Square(Integer px,Integer py, Color c) {
        super(c, new Point(px,py));
        //setLength(getWidth());
    }

    @Override
    public void setBoundingBox(Integer width, Integer length) { //methode qui définit les valeurs de width et length
        super.setBoundingBox(width,width);

    }

    public void draw(Graphics g) {

    }
}
