/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1114;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felipe.reblin
 */
public class SenhaTest {
    
    public SenhaTest() {
    }

    /**
     * Test of verificaSenha method, of class Senha.
     */
    @Test
    public void testVerificaSenha() {
        Senha senha = new Senha();
        boolean esperado = false;
        boolean result = senha.verificaSenha(5500);
        assertEquals(esperado, result);
    }
    
    @Test
    public void testVerificaSenhaTrue() {
        Senha senha = new Senha();
        boolean esperado = true;
        boolean result = senha.verificaSenha(2002);
        assertEquals(esperado, result);
    }
    
}
