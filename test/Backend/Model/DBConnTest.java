/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Model;

import Backend.Model.Builder.Kpversenyzo;
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
public class DBConnTest {
    
    public DBConnTest() {
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
     * Test of Select method, of class DBConn.
     */
    @Test
    public void testSelect() {
        System.out.println("Select metódus tesztelése");
        DBConn instance = new DBConn();
        Kpversenyzo expResult = new Kpversenyzo();
        Kpversenyzo result = instance.Select();
        assertTrue(expResult.getClass() == result.getClass());
    }

  

    /**
     * Test of Connect method, of class DBConn.
     */
    @Test
    public void testConnect() {
        System.out.println("Connectmetódus tesztelése");
        DBConn instance = new DBConn();
        instance.Connect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
