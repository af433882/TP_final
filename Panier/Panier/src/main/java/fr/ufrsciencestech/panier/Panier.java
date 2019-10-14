package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Panier extends Observable
{
	private ArrayList<Fruit> liste;
	private int taille;	
	public Panier(int t)
	{
		this.liste = new ArrayList<Fruit>();
		this.taille=t;
                
	} 

	public ArrayList<Fruit> getFruits()
	{
		return this.liste;
	}
	public int getTaille()
	{
		return this.taille;
	}
	public int getCountMax()
	{
		return this.liste.size();
	}
	public boolean estPlein()
	{
		if (this.getCountMax() == this.taille)
			return true;
		else
			return false;
	}
	public boolean estVide()
	{
		if (this.getCountMax() == 0)
			return true;
		else
			return false;
	}
	public boolean ajoute(Fruit f)
	{
		if(this.getCountMax() < this.taille)
		{
			this.liste.add(f);
                        this.setChanged();
                        this.notifyObservers();
			return true;
		}else{
                    System.out.println("le panier est plien");
                    return false;	
                }
				
	}
        public boolean ajoute() throws Exception
	{
		return this.ajoute(new Orange(2.86,"Espagne"));
                
	}
        public void retire()
	{
                if(this.getCountMax()>0){
                    this.liste.remove(this.liste.size()-1);
                    this.setChanged();
                    this.notifyObservers();
                }else{
                    System.out.println("le panier est vide");	
                }
                
	}
	public double getPrix()
	{
		double total=0;
		for(int i=0; i<this.getCountMax();i++)
		{
			total= total+this.liste.get(i).getPrix();
		}
		return total;
        }        
        public String toString(){
            String res ="";
            double total=0;
            for(int i=0; i<this.getCountMax();i++)
            {
            	res+= "element "+i+" : "+ this.liste.get(i).toString() +"\n";
            }
            return res;
            
        }        
        public void boycotteOrigine(String s)
        {
            for(int i=0;i<this.liste.size();i++)
            {
                if(this.liste.get(i).getOrigine().equals(s) )
                    this.liste.remove(i);
            }
            
            
            
        }
}
