package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        this.setBackground(Color.white);
        for(Figure figure : liste){
            figure.draw(graphics);
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
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
        X=e.getX();
        Y=e.getY();
        switch(nomForme){

            case "Ellipse" : liste.add(new Ellipse(X, Y, c));
                break;
            case "Carre" : liste.add(new Square(X, Y, c));
                break;
            case "Cercle" : liste.add(new Circle(X, Y, c));
                break;
            case "Rectangle" : liste.add(new Rectangle(X,Y,c));
                break;
        }
        //Tests:
        //System.out.println("x: "+X);
        //System.out.println("Y: "+Y);
        //System.out.println(nomForme);
        //System.out.println(liste);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        liste.get(liste.size()-1).setBoundingBox(e.getX()-X, e.getY()-Y);
        paintComponent(this.getGraphics());
    }

    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseDragged(MouseEvent e) {
        liste.get(liste.size()-1).setBoundingBox(e.getX()-X,e.getY()-Y);
        paintComponent(this.getGraphics());
    }
    @Override
    public void mouseMoved(MouseEvent e) {}

    public void efface() {
        liste.clear();
        super.paintComponent(this.getGraphics());
    }
    public ArrayList<Figure> getListe(){
        return this.liste;
    }

    public void save(){
        try{
            FileOutputStream fos = new FileOutputStream("Enregistrement");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(liste.size());
            for (Figure f : liste ){
                oos.writeObject(f);
            }
            oos.close();
            System.out.println("Dessin enregistré");

        }
        catch(Exception e){
            System.out.println("Erreur");
        }
    }
}
