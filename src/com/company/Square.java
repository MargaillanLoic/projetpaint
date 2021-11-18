package com.company;

import java.awt.*;

public class Square extends Figure{




    public Square(Integer px,Integer py, Color c) {
        super(c, new Point(px,py));
        //setLength(getWidth());
    }

    public int getPerimeter(){
        return 2 * (getWidth() + getWidth());
    }

    public int getSurface(){
        return (getWidth() * getWidth());
    }

    @Override


    public void setBoundingBox(Integer width, Integer length) { //methode qui définit les valeurs de width et length
        super.setBoundingBox(width,width);

    }

    public void draw(Graphics g) {

    }
}
