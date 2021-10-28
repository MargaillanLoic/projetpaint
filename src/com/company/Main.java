package com.company;
import java.awt.*;

import static java.awt.Color.blue;
import static java.awt.Color.red;

public class Main {

    public static void main(String[] args) {
    Point a = new Point(156, 52);
    Point b = new Point();
    System.out.println(a);
    System.out.println(b);

    Rectangle rectangle = new Rectangle(15,30,blue);
    rectangle.setBoundingBox(200,150);
    System.out.println(rectangle);

    Square carré = new Square(45, 50, red);
    carré.setBoundingBox(200,500);
    System.out.println(carré);

    }
}
