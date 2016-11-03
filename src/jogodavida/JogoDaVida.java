/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavida;

/**
 *
 * @author Yuri Pereira
 */
public class JogoDaVida {

    /**
     * @param args the command line arguments
     */
    static int[][] matriz = {{1, 0, 0}, {0, 1, 0}, {1, 0, 1}};

    public static void main(String[] args) {
        
        Celula celula = new Celula(matriz);
        
        try {
            System.out.println(celula.verificarVidaCelula(2, 2));;
            System.out.println(celula.verificarVidaCelula(1, 2));;
            System.out.println(celula.verificarVidaCelula(3, 2));;
            System.out.println(celula.verificarVidaCelula(3, 3));;
        } catch (Exception e) {
            System.out.println("Informe um valor válido para a matriz 3x3, ou seja, um valor entra 1 e 3 inclusive.");
        }
    }//main

}//class
