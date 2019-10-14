package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Orange implements Fruit
{

    private double prix;
    private String origine;

    public Orange(double p, String o) throws Exception	
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
