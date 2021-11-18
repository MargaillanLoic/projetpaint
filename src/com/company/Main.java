package com.company;
import java.awt.*;

import static java.awt.Color.*;

public class Main {

    public static void main(String[] args) {
    Point a = new Point(156, 52);
    Point b = new Point();
    System.out.println(a);
    System.out.println(b);

    Rectangle rectangle = new Rectangle(15,30,blue);
    rectangle.setBoundingBox(200,150);
    System.out.println(rectangle);
    System.out.println("le perimètre est " + rectangle.getPerimeter());
    System.out.println("la surface est "+ rectangle.getSurface());

    Square carré = new Square(45, 50, red);
    carré.setBoundingBox(200,500);
    System.out.println(carré);
    System.out.println("le périmètre est " +carré.getPerimeter());
    System.out.println("la surface est " + carré.getSurface());


    Circle cercle = new Circle(25,25,red);
    cercle.setBoundingBox(250,250);
    System.out.println(cercle);
    System.out.println("le périmètre est " +cercle.getPerimeter());
    System.out.println("la surface est " + cercle.getSurface());

    Ellipse ellipse = new Ellipse(25, 50, yellow);
    ellipse.setBoundingBox(50,25);
    System.out.println(ellipse);
    System.out.println("le périmètre est " +ellipse.getPerimeter());
    System.out.println("la surface est " + ellipse.getSurface());
    }
}
