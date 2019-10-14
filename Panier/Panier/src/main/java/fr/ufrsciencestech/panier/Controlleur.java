package fr.ufrsciencestech.panier;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author af433882
 */
public class Controlleur  implements ActionListener{
    
    private Panier pan;

    public Controlleur(Panier pan) {
        this.pan = pan;
    }

    public Panier getPanier() {
        return pan;
    }

    public void setPanier(Panier pan) {
        this.pan = pan;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(((Component)e.getSource()).getName().equals("Plus Orange")){
            
                System.out.println("plus");
                pan.ajoute(new Orange(2,"ouai"));
            
            }else if(((Component)e.getSource()).getName().equals("Plus Banane")){
            
                System.out.println("plus");
                pan.ajoute(new Banane(2,"ouai"));
            }else if(((Component)e.getSource()).getName().equals("Plus Cerise")){
            
                System.out.println("plus");
                pan.ajoute(new Cerise(2,"ouai"));
            }else{
                System.out.println("moins");
                pan.retire();
            }
        } catch (Exception ex) {
           System.out.println("le panier est plien");
        }
    }
    
}
