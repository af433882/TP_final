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
public class Cerise implements Fruit {
    private double prix;
    private String origine;

    public Cerise(double p, String o) throws Exception	
        {	
		this.prix=p;
		this.origine=o;
                if(prix<0)
                    throw new Exception("prix invalide");
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

    @Override
    public String toString() {
        return "Orange{" + "prix=" + prix + "$, origine=" + origine + '}';
    }
}
