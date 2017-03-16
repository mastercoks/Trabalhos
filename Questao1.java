/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author Matheus
 */
public class Questao1 {

    public static void heapSort(int[] v) {
        construirMinHeap(v);
        int n = v.length;

        for (int i = v.length - 1; i > 0; i--) {
            troca(v, i, 0);
            minHeapify(v, 0, --n);
        }
    }

    private static void construirMinHeap(int[] v) {
        for (int i = v.length / 2 - 1; i >= 0; i--) {
            minHeapify(v, i, v.length);
        }

    }

    private static void minHeapify(int[] vetor, int pos, int tamanhoDoVetor) {

        int max = 2 * pos + 1, right = max + 1;
        if (max < tamanhoDoVetor) {

            if (right < tamanhoDoVetor && vetor[max] > vetor[right]) {
                max = right;
            }

            if (vetor[max] < vetor[pos]) {
                troca(vetor, max, pos);
                minHeapify(vetor, max, tamanhoDoVetor);
            }
        }
    }

    public static void troca(int[] v, int j, int aposJ) {
        int aux = v[j];
        v[j] = v[aposJ];
        v[aposJ] = aux;
    }
}
