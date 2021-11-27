package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener {
    static protected Dessin d = new Dessin();

    public Window(String Title,int x, int y) {
        super(Title);
        this.setLocation(500,150);
        this.setSize(1000,750);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenuBar m = new JMenuBar();

        JMenu menu1=new JMenu("Fichiers");
        JMenuItem ouvrir= new JMenuItem("Ouvrir");
        JMenuItem nouveau = new JMenuItem("Nouveau") ;
        JMenuItem enregistrer = new JMenuItem("Enregistrer") ;
        JMenuItem quitter = new JMenuItem("Quitter") ;

        menu1.add(ouvrir);
        menu1.add(nouveau);
        menu1.add(enregistrer);
        menu1.add(quitter);

        JMenu menu2=new JMenu("A propos");
        JMenuItem auteurs= new JMenuItem("Auteurs");

        menu2.add(auteurs);

        m.add(menu1);
        m.add(menu2);

        //this.setJMenuBar(m);

        ouvrir.addActionListener(this);
        nouveau.addActionListener(this);
        enregistrer.addActionListener(this);
        quitter.addActionListener(this);
        auteurs.addActionListener(this);


        Container contentPanel = this.getContentPane();

        JPanel pan1 = new JPanel();
        String[] buttonName1 ={"Black","Blanc","Rouge","Vert","Bleu","Orange"};
        pan1.setLayout(new GridLayout(2,4));

        JButton colorButton[] = new JButton[6];
        for (int i=0;i<6;i++){
            colorButton[i]=new JButton(buttonName1[i]);
            pan1.add(colorButton[i]);
            colorButton[i].addActionListener(this);
        }

        colorButton[0].setBackground(Color.black);
        colorButton[1].setBackground(Color.white);
        colorButton[2].setBackground(Color.red);
        colorButton[3].setBackground(Color.green);
        colorButton[4].setBackground(Color.blue);
        colorButton[5].setBackground(Color.orange);


        JPanel pan2 = new JPanel();
        String[] buttonName2 = {"Ellipse","Cercle","Carre","Rectangle"};
        pan2.setLayout(new GridLayout(2,2));

        JButton nameButton[] = new JButton[4];
        for(int i=0;i<4;i++){
            nameButton[i]= new JButton(buttonName2[i]);
            pan2.add(nameButton[i]);
            nameButton[i].addActionListener(this);
        }

        //this.getContentPane().add(pan1);
        JPanel panneau = new JPanel();
        panneau.setLayout(new GridLayout(1,2));
        panneau.add(pan1);
        panneau.add(pan2);
        d = new Dessin();
       // panneau.setSize(1000,250);
       // this.setLayout(new GridLayout(2,1));
        contentPanel.add(new JTextArea(""),"Center");
        this.getContentPane().add(d,"Center");
        this.getContentPane().add(panneau,"South");
        this.setJMenuBar(m);
        this.setVisible(true);

    }

    public static void main (String args[]){
        Window win = new Window("Le Paint",1000,800);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd=e.getActionCommand();
        switch (cmd){
            case "Rouge" : d.setCouleur(Color.red);
                System.out.println(("rouge"));
                break;
            case "Vert" : d.setCouleur(Color.green);
                break;
            case "Noir" : d.setCouleur(Color.black);
                break;
            case "Bleu" : d.setCouleur(Color.blue);
                break;
            case "Jaune" : d.setCouleur(Color.yellow);
                break;
            case "Rose" : d.setCouleur(Color.pink);
                break;
            case "Magenta" : d.setCouleur(Color.magenta);
                break;
            case "Orange" : d.setCouleur(Color.orange);
                break;
            case "Rectange" : d.setNomFig("Rectangle");
                break;
            case "Carre" : d.setNomFig("Carre");
                break;
            case "Ellipse" : d.setNomFig("Ellipse");
                break;
            case "Cercle" : d.setNomFig("Cercle");
                break;
            case "Auteurs" : JOptionPane jop = new JOptionPane();
                jop.showInternalMessageDialog(jop, "Auteurs : Loïc Margaillan 2G2TP1", "Information", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Quitter" : System.exit(0);
                break;
            case "Nouveau" : d.efface();
                break;
        }
    }
}
