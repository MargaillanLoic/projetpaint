package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.event.*;
import java.util.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Dessin extends JPanel implements MouseListener, MouseMotionListener{
    protected ArrayList<Figure> liste;
    protected Color c;
    protected String nomForme;
    protected int X;
    protected int Y;

    public Dessin(){
        super();
        this.c = Color.black;
        this.nomForme = "Rectangle";
        this.liste = new ArrayList<Figure>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);
        for(Figure f : liste){
            f.draw(g);
        }
    }
    public void setCouleur(Color cl){
        this.c = cl;
    }

    public void setNomFig(String nomFig){
        this.nomForme = nomFig;
    }

    public void setListe(ArrayList<Figure> l){
        this.liste = l;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
