/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author af433882
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class Banane implements Fruit{




    private double prix;
    private String origine;

    public Banane(double p, String o) throws Exception	
        {	
		this.prix=p;
		this.origine=o;
                if(prix<0)
                    throw new Exception("prix invalide");
	}
        


    @Override
    public String toString() {
        return "Banane{" + "prix=" + prix + "$, origine=" + origine + '}';
    }
    
    public double getPrix()
	{
		return this.prix;
	}

    public String getOrigine()
	{
		return this.origine;
	}

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }




}
