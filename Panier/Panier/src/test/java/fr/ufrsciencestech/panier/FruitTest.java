/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author af433882
 */
public abstract class FruitTest {
        //the factory methods
    abstract Fruit createFruit(double prix,String origine);
    abstract Fruit createFruitNull();
    
    
    public FruitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        //mok1 = new Banane(0.5, "France");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrix method, of class Fruit.
     */
    @Test
    public void testGetPrix() {
        Fruit fs = createFruit(0.5,"France");
        double expected = 0.5;
        double result = fs.getPrix();
        assertTrue(expected == result);
    }

    /**
     * Test of getOrigine method, of class Fruit.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Fruit instance = new FruitImpl();
        String expResult = "";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrix method, of class Fruit.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double p = 0.0;
        Fruit instance = new FruitImpl();
        instance.setPrix(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigine method, of class Fruit.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String s = "";
        Fruit instance = new FruitImpl();
        instance.setOrigine(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FruitImpl implements Fruit {

        public double getPrix() {
            return 0.0;
        }

        public String getOrigine() {
            return "";
        }

        public void setPrix(double p) {
        }

        public void setOrigine(String s) {
        }
        
    }
    
}
