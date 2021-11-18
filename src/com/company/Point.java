package com.company;

public class Point {
    private Integer X;
    private Integer Y;


    public Point (Integer X, Integer Y) { //constructeur
        this.X=X;
        this.Y=Y;
    }

    public Point () { //constructeur
        X=0;
        Y=0;
    }

    @Override  //generate toString
    public String toString() {
        return "(" + X + ";" + Y + ")";
    }




    public Integer getX() {
        return X;
    }

    public Integer getY() {
        return Y;
    }

    public void setX(Integer x) {
        X = x;
    }

    public void setY(Integer y) {
        Y = y;
    }
}


