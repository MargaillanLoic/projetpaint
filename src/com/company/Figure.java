package com.company;
import java.awt.*;

public abstract class Figure {

    protected Color c;
    protected Point origine;
    private Integer width;
    private Integer length;


    public Figure(Color c, Point p) { //constructeur
        this.c = c;
        this.origine = p;
    }


    public void setBoundingBox(Integer width, Integer length) { //methode qui définit les valeurs de width et length
        this.width= width;
        this.length= length;

    }



    @Override  //generate toString
    public String toString() {

        return "Une figure de taille " + width + ";" + length + " , de couleur, " + c +" et de point " + origine + " a été créé ";
    }

    public abstract void draw(Graphics graphics);//abstract method



    public Color getC() {
        return c;
    }

    public Point getP() {
        return origine;
    }


    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }
}
