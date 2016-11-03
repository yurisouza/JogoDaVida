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
public class Celula {
    
    private int [][] matriz;

    public Celula(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    public String verificarVidaCelula(int linha, int coluna) throws ArrayIndexOutOfBoundsException {

        int celula = buscarValorMatriz(linha, coluna);
        int vizinhos = verificarNumeroDeVizinhos(linha, coluna);
        
        // Qualquer célula viva com menos que duas células vivas vizinhas morre, por baixa população;
        if (celula == 1 && vizinhos < 2) {
            return "A célula irá morrer, por baixa população";

            // Qualquer célula viva com mais que três células vivas vizinhas morre, por alta população;
        } else if (celula == 1 && vizinhos > 3) {
            return "A célula irá morrer, por alta população";

            // Qualquer célula viva com duas ou três células vivas vizinhas permanece viva para a próxima geração;
        } else if (celula == 1 && (vizinhos == 2 || vizinhos == 3)) {
            return "A célula continuará viva para a próxima geração";

            // Qualquer célula morta com exatamente três células vivas vizinhas se transforma em uma célula viva;
        } else if (celula == 0 && vizinhos == 3) {
            return "A célula transforma-se em célula viva.";

            // Como as condições de células vivas foram suprimidas acima, e só há uma condição para célula morta, logo 
            // qualquer outra situação a célula continuará morta.
        } else {
            return "A célula permanecerá morta!";
        }
    }

    private int buscarValorMatriz(int linha, int coluna) throws ArrayIndexOutOfBoundsException {
        return matriz[linha - 1][coluna - 1];
    }

    public int verificarNumeroDeVizinhos(int linha, int coluna) throws ArrayIndexOutOfBoundsException {

        int numeroVizinhos = 0;

        // Coluna a esquerda
        if (verificarMatriz(linha, coluna - 1)) {
            numeroVizinhos += buscarValorMatriz(linha, coluna - 1);
        }

        // Coluna a direita
        if (verificarMatriz(linha, coluna + 1)) {
            numeroVizinhos += buscarValorMatriz(linha, coluna + 1);
        }

        // Linha acima
        if (verificarMatriz(linha - 1, coluna)) {
            numeroVizinhos += buscarValorMatriz(linha - 1, coluna);
        }

        // Linha abaixo
        if (verificarMatriz(linha + 1, coluna)) {
            numeroVizinhos += buscarValorMatriz(linha + 1, coluna);
        }

        // Linha acima - coluna esquerda
        if (verificarMatriz(linha - 1, coluna - 1)) {
            numeroVizinhos += buscarValorMatriz(linha - 1, coluna - 1);
        }

        // Linha acima - coluna direita
        if (verificarMatriz(linha - 1, coluna + 1)) {
            numeroVizinhos += buscarValorMatriz(linha - 1, coluna + 1);
        }

        // Linha abaixo - coluna esquerda
        if (verificarMatriz(linha + 1, coluna - 1)) {
            numeroVizinhos += buscarValorMatriz(linha + 1, coluna - 1);
        }

        // Linha abaixo - coluna direita
        if (verificarMatriz(linha + 1, coluna + 1)) {
            numeroVizinhos += buscarValorMatriz(linha + 1, coluna + 1);
        }

        return numeroVizinhos;
    }

    private boolean verificarMatriz(int linha, int coluna) {
        if (linha > 0 && linha <= matriz.length && coluna > 0) {
            if (linha <= matriz.length && coluna <= matriz[linha - 1].length) {
                return true;
            }
        }
        return false;
    }
    
}
