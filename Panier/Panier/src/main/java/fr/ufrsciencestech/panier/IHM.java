/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author md405778
 */
public class IHM extends javax.swing.JFrame implements Observer{
    
    public static void main(String args[]) throws Exception {
        IHM fenetre = new IHM();
        fenetre.setVisible(true);
    }
    
    public IHM() throws Exception{
        initComponents();
        comboBox.addItem("Orange");
        comboBox.addItem("Banane");
        comboBox.addItem("Cerise");
        this.btPlus.setName("Plus Orange");
        this.btMoins.setName("Moins");
        Panier p = new Panier(10);
        p.addObserver(this);
        p.ajoute(new Orange(9.99,"france"));
        p.ajoute(new Banane(9.99,"france"));
        p.ajoute(new Cerise(9.99,"france"));
        this.ajoutControlleur(new Controlleur(p));
        System.out.println(p.toString());
    }
    
    private void initComponents() {

        btMoins = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        affichage = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btPlus = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox();
        btMoins.setText("-");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(btMoins, java.awt.BorderLayout.SOUTH);

        affichage.setColumns(20);
        affichage.setRows(5);
        jScrollPane1.setViewportView(affichage);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        btPlus.setText("+");
        jPanel1.add(btPlus);

        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(comboBox);

        this.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }
    
    private javax.swing.JTextArea affichage;
    private javax.swing.JButton btMoins;
    private javax.swing.JButton btPlus;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   


    public void update(Observable o, Object o1) {
        Panier p = (Panier)o;
        int total = p.getCountMax();
        int bananes = 0;
        int oranges = 0;
        int cerises = 0;
        for(Fruit f : p.getFruits()){
            if(f instanceof Banane)
                bananes++;
            if(f instanceof Orange)
                oranges++;
            if(f instanceof Cerise)
                cerises++;
        }
        
        String txt = total + " fruits\n"
                + oranges + " oranges\n"
                + cerises + " cerises\n"
                + bananes + " bananes";
        
        this.affichage.setText(txt);
    }
    
    public void ajoutControlleur(Controlleur c){
        this.btPlus.addActionListener(c);
        this.btMoins.addActionListener(c);
    }
    
    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
        btPlus.setName("Plus "+comboBox.getSelectedItem().toString());
    } 
}

