/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author af433882
 */

public class PanierTest {
    private Panier p_plein3, p_vide3, p_presque_plein3, p_vide0,p_vide2, p_vide, p_1el3;
    private Orange mock_o1,mock_o2;
    
    public PanierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    p_vide=new Panier(3);
    mock_o1= mock(Orange.class);
    mock_o2=mock(Orange.class);
    
    when(mock_o1.getPrix()).thenReturn(0.50);
    when(mock_o2.getPrix()).thenReturn(0.40);
    
    p_vide0=new Panier(0); p_vide2 = new Panier(-2);
    p_1el3=new Panier(3);
    p_1el3.ajoute(mock_o1);
    
    p_vide3 = new Panier(3);
    
    p_plein3 = new Panier(3);
    p_plein3.ajoute(mock_o1);
    p_plein3.ajoute(mock_o1);
    p_plein3.ajoute(mock_o2);
    }
    
    @After
    public void tearDown() {
    }








    
    
    public void testAjoutePanierVide() {
        System.out.println("ajoute");
        p_vide3.ajoute(mock_o1);
        assertTrue(p_vide3.getTaille() == 1);
        assertEquals(p_vide3.getFruits().get(0), mock_o1);


    }





    @Test
    public void testGetPrixPanierVideCoutMax3() {
        System.out.println("getPrix");
        double attendu = 0.0;
        double result = p_vide3.getPrix();
        assertTrue(attendu ==  result);

        
    }
    
    
    @Test
    public void testGetPrixPanierPleinA3Elements() {
        System.out.println("getPrix");
        double prix_attendu = 1.4;
        double result = p_plein3.getPrix();
        assertTrue(prix_attendu == result);

        
    }
    
    
    



    /**
     * Test of boycotteOrigine method, of class Panier.
     
    @Test
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");
        String s = "";
        Panier instance = null;
        instance.boycotteOrigine(s); 

    }*/
    
}
