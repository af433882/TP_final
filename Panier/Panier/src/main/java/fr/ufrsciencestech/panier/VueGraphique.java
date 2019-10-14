package fr.ufrsciencestech.panier;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

/**
 *
 * @author af433882
 */
public class VueGraphique extends JFrame implements Observer{
    
    private JButton dec;
    private JButton inc;
    private JLabel affiche;

    public JButton getDec() {
        return dec;
    }

    public JButton getInc() {
        return inc;
    }

    public JLabel getAffiche() {
        return affiche;
    }

    public void setAffiche(JLabel affiche) {
        this.affiche = affiche;
    }
    
    
    public VueGraphique(){
        this.inc = new JButton("+");
        this.inc.setName("Plus");
        this.dec = new JButton("-");
        this.dec.setName("Moins");
        this.affiche = new JLabel("non initialiser");
        this.affiche.setHorizontalAlignment(JLabel.CENTER);
        this.setTitle("Panier");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3,1));
        //On ajoute le bouton au content pane de la JFrame
        this.getContentPane().add(dec);
        this.getContentPane().add(affiche);
        this.getContentPane().add(inc);
        this.pack();
        this.setVisible(true);
    }   

    @Override
    public void update(Observable o, Object arg) {
        this.affiche.setText(""+((Panier)o).getCountMax());
    }
    public void ajoutControlleur(Controlleur c){
        this.getInc().addActionListener(c);
        this.getDec().addActionListener(c);
    }
    
}
