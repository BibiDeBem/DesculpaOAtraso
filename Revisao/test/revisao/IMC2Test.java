/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inaci
 */
public class IMC2Test {
    
    public IMC2Test() {
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
     * Test of imc method, of class IMC2.
     */
    @Test
    public void testImc() {
        System.out.println("imc");
        float peso = 82.0F;
        float altura = 1.64F;
        IMC2 instance = new IMC2();
        float expResult = 30.49F;
        float result = instance.imc(peso, altura);
        assertEquals(expResult, result, 0.01); //  alfa para casas decimais de comparação
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of classificacao method, of class IMC2.
     */
    @Test
    public void testClassificacao() {
        System.out.println("classificacao");
        float imc = 30.49F;
        IMC2 instance = new IMC2();
        String expResult = "Obesidade"; // String
        String result = instance.classificacao(imc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
