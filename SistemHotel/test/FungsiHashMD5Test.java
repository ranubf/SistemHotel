/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemhotel.FungsiHashMD5;

/**
 *
 * @author 1615101233
 */
public class FungsiHashMD5Test {

    FungsiHashMD5 fungsiHashInstance;

    public FungsiHashMD5Test() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testFungsiHash() {
        String expResult = "be89e250d8388c5e7ded2f1630e5daa4";
        String result = FungsiHashMD5.hash("");
        System.out.println("* test method 1 testFormMessage()");
        assertEquals(expResult, result);
    }
}
