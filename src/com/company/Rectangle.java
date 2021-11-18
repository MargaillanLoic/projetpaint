package com.company;
import java.awt.*;

public class Rectangle extends Figure {




    public Rectangle (int px, int py, Color c){
        super(c,new Point(px,py));
    }

    public int getPerimeter(){
        return 2 * (getWidth() + getLength());
    }

    public int getSurface(){
        return (getWidth() * getLength());
    }

    public void draw(Graphics g) {

    }

}
