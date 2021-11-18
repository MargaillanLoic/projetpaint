package com.company;
import java.awt.*;

public abstract class Figure {

    private Color c;
    private Point p;
    private Integer width;
    private Integer length;

    //public abstract void setBoundingBox (Integer heightBB, Integer widthBB); //abstract method

    public abstract void draw(Graphics g);//abstract method

    public Figure(Color c, Point p) { //constructeur
        this.c = c;
        this.p = p;
    }


    public void setBoundingBox(Integer width, Integer length) { //methode qui définit les valeurs de width et length
        this.width= width;
        this.length= length;

    }



    @Override  //generate toString
    public String toString() {

        return "Une figure de taille " + width + ";" + length + " , de couleur, " + c +" et de point " + p + " a été créé ";
    }


    public Color getC() {
        return c;
    }

    public Point getP() {
        return p;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }
}
