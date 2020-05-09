
package Backend.Model.Builder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class KpversenyzoBuilderTest {
    
    public KpversenyzoBuilderTest() {
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
     * Test of SetNev method, of class KpversenyzoBuilder.
     */
    @Test
    public void testSetNev() {
        System.out.println("SetNev");
        String nev = "David";
        KpversenyzoBuilder instance = new KpversenyzoBuilder();
        KpversenyzoBuilder expResult = instance.SetNev("David");
        KpversenyzoBuilder result = instance.SetNev(nev);
       assertEquals(expResult, result);
    }

    /**
     * Test of SetKerekpargyarto method, of class KpversenyzoBuilder.
     */
    @Test
    public void testSetKerekpargyarto() {
        System.out.println("SetKerekpargyarto");
        String kerekpargyarto = "Specialized";
        KpversenyzoBuilder instance = new KpversenyzoBuilder();
        KpversenyzoBuilder expResult = instance.SetKerekpargyarto("Specialized");
        KpversenyzoBuilder result = instance.SetKerekpargyarto(kerekpargyarto);
       assertEquals(expResult, result);
    }

    /**
     * Test of SetKptipus method, of class KpversenyzoBuilder.
     */
    @Test
    public void testSetKptipus() {
        System.out.println("SetKptipus teszt");
        String kptipus = "DH";
        KpversenyzoBuilder instance = new KpversenyzoBuilder();
        KpversenyzoBuilder expResult = instance.SetKptipus("DH");
        KpversenyzoBuilder result = instance.SetKptipus(kptipus);
       assertEquals(expResult, result);
    }

    /**
     * Test of Build method, of class KpversenyzoBuilder.
     */
    @Test
    public void testBuild() {
        System.out.println("Buildelés teszt");
        KpversenyzoBuilder instance = new KpversenyzoBuilder();
        Kpversenyzo expResult = new Kpversenyzo();
        Kpversenyzo result = instance.Build();
        assertTrue(expResult.getClass() == result.getClass());
    }
    
}
