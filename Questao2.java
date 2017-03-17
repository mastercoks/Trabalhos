public class Questao2 {

  private static boolean verificar_aux(int array[]) {
    boolean aceita = false;
    for (int i = 0; i < array.length/2; ++i) {
      int esquerda = 2*i +1;
      int direita = 2*i +2;
      if (direita < array.length) {
        if (array[i] > array[esquerda] && array[i] > array[direita]) {
          aceita = true;
        } else {
          return false;
        }
      } else if (esquerda < array.length) {
        if (array[i] > array[esquerda]) {
          aceita = true;
        } else {
          return false;
        }
      }
    }
    return aceita;
  }

  public static void verificar(int array[]) {
    if (verificar_aux(array)) {
      System.out.println("Aceita");
    } else {
      System.out.println("Rejeita");
    }
  }

  public static void main(String[] args) {
    System.out.println("Informe o tamanho do array: ");
    int tamanho = new java.util.Scanner(System.in).nextInt();
    int[] array = new int[tamanho];
    for (int i = 0; i < tamanho; i++) {
      System.out.println("Insira um elemento: ");
      array[i] = new java.util.Scanner(System.in).nextInt();
    }
    System.out.println("Array: " + java.util.Arrays.toString(array));
    verificar(array);
  }
}
