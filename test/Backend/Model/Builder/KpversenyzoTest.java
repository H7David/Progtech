/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Model.Builder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prog
 */
public class KpversenyzoTest {
    
    public KpversenyzoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getKerekpar method, of class Kpversenyzo.
     */
    @Test
    public void testGetKerekpar() {
        System.out.println("getKerekpar teszt");
        Kpversenyzo instance = new Kpversenyzo();
        String expResult = "gyarto";
        instance.setKerekpargyarto("gyarto");
        String result = instance.getKerekpar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNev method, of class Kpversenyzo.
     */
    @Test
    public void testGetNev() {
        System.out.println("getNev teszt");
        Kpversenyzo instance = new Kpversenyzo();
        String expResult = "nev";
        instance.setNev("nev");
        String result = instance.getNev();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKptipus method, of class Kpversenyzo.
     */
    @Test
    public void testGetKptipus() {
        System.out.println("Kptipus teszt");
        Kpversenyzo instance = new Kpversenyzo();
        String expResult = "DH";        
        instance.setKptipus("DH");
        String result = instance.getKptipus();
        assertEquals(expResult, result);     
    }

    /**
     * Test of setKptipus method, of class Kpversenyzo.
     */
    @Test
    public void testSetKptipus() {
        System.out.println("setKptipus teszt");
        String kptipus = "DH";
        Kpversenyzo instance = new Kpversenyzo();
        instance.setKptipus(kptipus);
        assertEquals(kptipus, instance.getKptipus());
    }

    /**
     * Test of setKerekpargyarto method, of class Kpversenyzo.
     */
    @Test
    public void testSetKerekpargyarto() {
        System.out.println("setKerekpargyarto ellenőrzése");
        String kerekpargyarto = "Scott";
        Kpversenyzo instance = new Kpversenyzo();
        instance.setKerekpargyarto(kerekpargyarto);
        assertEquals(kerekpargyarto, instance.getKerekpar());
       
    }

    /**
     * Test of setNev method, of class Kpversenyzo.
     */
    @Test
    public void testSetNev() {
        System.out.println("setNev tesztelése");
        String nev = "David";
        Kpversenyzo instance = new Kpversenyzo();
        instance.setNev(nev);
        assertEquals(nev, instance.getNev());      
    }
    
}
