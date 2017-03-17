import java.util.Scanner;
import java.util.Arrays;

public class Questao3 {
  private static Scanner sc;

  //Método bubbleSort, ele é quem faz a ordenação
  private static long bubbleSort (int[] dados){
    long tIncio = System.currentTimeMillis();
    boolean troca = true;

    while (troca) {
      troca = false;
        for (int posicao = 0; posicao < (dados.length)-1; posicao++){
          if (dados[posicao] > dados[posicao+1]){
            int variavelAuxiliar = dados[posicao+1];
            dados[posicao+1] = dados[posicao];
            dados[posicao] = variavelAuxiliar;
            troca = true;
          }
        }
    }
    long tFinal = System.currentTimeMillis();
    return tFinal - tIncio;
  }

	private static void heapify(int dados[], int n, int i) {
		int max, filho;
		filho = 2 * i + 1;
		max = i;
		if (filho < n)
			if (dados[filho] > dados[max])
				max = filho;
		if (filho + 1 < n)
			if (dados[filho + 1] > dados[max])
				max = filho + 1;
		if (max != i) {
			int temp = dados[i];
			dados[i] = dados[max];
			dados[max] = temp;
			heapify(dados, n, max);
		}
	}

	private static void buildheap(int dados[]) {
		for (int i = dados.length / 2 - 1; i >= 0; i--)
			heapify(dados, dados.length, i);
	}

	private static long heapSort(int dados[]) {
    long tIncio = System.currentTimeMillis();
    buildheap(dados);
		for (int i = dados.length - 1; i >= 1; i--) {
			int temp = dados[0];
			dados[0] = dados[i];
			dados[i] = temp;
			heapify(dados, i, 0);
		}
    long tFinal = System.currentTimeMillis();
    return tFinal - tIncio;
	}

  public static void main(String args[]) {
    sc = new Scanner(System.in);

    System.out.print("Entre com o tamanho do array: ");
    int n = sc.nextInt();

    int hs[] = new int[n];
    for (int i = 0; i < n; i++) {
      hs[i] = new java.util.Random().nextInt(n*2);
    }
    int bs[] = hs.clone();

    System.out.println("O array ordenado com bubbleSort com tempo: " + bubbleSort(bs));

    System.out.println("O array ordenado com heapSort com tempo: " + heapSort(hs));
  }

}
