package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener {

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

        JMenu menu2=new JMenu("About");


        m.add(menu1);
        this.setJMenuBar(m);
        ouvrir.addActionListener(this);
        nouveau.addActionListener(this);
        enregistrer.addActionListener(this);
        ouvrir.addActionListener(this);

        Container contentPanel = this.getContentPane();

        JPanel pan1 = new JPanel();

        String[] buttonName ={"Noir","Blanc","Rouge","Vert","Bleu"};

        JButton colorButton[] = new JButton[5];
        for (int i=0;i<5;i++){
            colorButton[i]=new JButton(buttonName[i]);
            pan1.add(colorButton[i]);
            colorButton[i].addActionListener(this);
        }
        //bouton1.setBackground(Color.black);

        pan1.setLayout(new GridLayout(2,4));

        this.getContentPane().add(pan1);

        this.setVisible(true);

    }

    public static void main (String args[]){
        Window win = new Window("Le Paint",1000,800);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd=e.getActionCommand();
        switch (cmd){
            case "Que viva Ensea":
            System.out.println("clicked");
            break;
        }
    }
}
