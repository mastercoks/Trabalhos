/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author Matheus Coqueiro, Pedro Maioli
 */
public class Questao1 {

    int[] vaux = v;
    public static void heapSort(int[] v) {
        construirMinHeap(v); //constroi heap adicionando índices ao vetor
        int n = v.length;

        for (int i = v.length - 1; i > 0; i--) { //do maior índice até a raiz da heap
            troca(v, i, 0); // peguei o ultimo elemento (minHeapify: menor, maxHeapify: maior) e ordenei
            minHeapify(v, 0, --n); 
        }
    }

    private static void construirMinHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--) { //a partir do pai de maior índice ; percorre lado direito, lado esquerdo e por ultimo a raiz
            minHeapify(v, i, v.length); //conserte posições fora de ordem recursivamente
        }

    }

    private static void minHeapify(int[] vetor, int pai, int tamanhoDoVetor) { //função que troca posições fora de ordem

        int filhoEsquerdo = 2 * pai + 1; //define filho esquerdo 
        int filhoDireito = filhoEsquerdo + 1; // define filho direito

        if (filhoEsquerdo < tamanhoDoVetor) { //se houver filho esquerdo

            if (filhoDireito < tamanhoDoVetor && vetor[filhoEsquerdo] > vetor[filhoDireito]) { //se houver filho direito e filhoEsq > filhoDir
                filhoEsquerdo = filhoDireito; //armazene valor do menor (minHeapify)
            }

            if (vetor[filhoEsquerdo] < vetor[pai]) { //fora de ordem
                troca(vetor, filhoEsquerdo, pai); //jogue o menor valor para o pai
                minHeapify(vetor, filhoEsquerdo, tamanhoDoVetor); //recursão
            }
        }
    }

    public static void troca(int[] v, int j, int apaiJ) { //trocando o valor literal das posições
        int aux = v[j];
        v[j] = v[apaiJ];
        v[apaiJ] = aux;
    }
}

vaux = v;
a
