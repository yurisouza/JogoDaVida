/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavida;

import jogodavida.Celula;
import jogodavida.Celula;
import static jogodavida.JogoDaVida.matriz;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Yuri Pereira
 */
public class CelulaTest {
    
    Celula celula;
    
    public CelulaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       celula = new Celula(matriz);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMatriz method, of class Celula.
     */


    /**
     * Test of verificarVidaCelula method, of class Celula.
     */
    @Test
    public void testVerificarVidaCelula() {
        System.out.println("verificarVidaCelula");;
        int linha = 2;
        int coluna = 2;
        Assert.assertEquals(celula.verificarVidaCelula(linha, coluna), 
                "A célula permanecerá morta!");
    }
    
//    @Test
//    public void testVerificarNumeroDeVizinhos(){
//        System.out.println("verificarNumeroDeVizinhos");;
//        int linha = 2;
//        int coluna = 2;
//        int contagemCelula = celula.verificarNumeroDeVizinhos(linha, coluna);
//        Assert.assertEquals(contagemCelula, 3);
//    }
    
    
}
