package com.company;
import java.awt.*;

public class Ellipse extends Figure {


    public Ellipse(Integer px, Integer py, Color c) {
        super(c, new Point(px,py));
    }

    public int getPerimeter(){
        return (int) (2 * 3.14 * Math.sqrt(((getLength()*getLength())+(getWidth()*getWidth()))/2) );
    }

    public int getSurface(){
        return (int) (3.14* getWidth() * getLength());
    }

    public void draw(Graphics g) {

    }
}
