package exercicios_java.adversos;

public class Exercicio_II {

 public static void bubbleSort(int[] vetor) {
  int n = vetor.length;
  for (int i = 0; i < n - 1; i++) {
      boolean trocou = false;
      for (int j = 0; j < n - 1 - i; j++) {
          if (vetor[j] > vetor[j + 1]) {
              int temp = vetor[j];
              vetor[j] = vetor[j + 1];
              vetor[j + 1] = temp;
              trocou = true;
          }
      }
      if (!trocou) break;
  }
 }

 public static void main(String[] args) {

 int[][] matriz = {
  {9, 2, 7},
  {4, 6, 1},
  {8, 3, 5}
};

int [] vetor1 = new int[matriz[0].length];
int [] vetor2 = new int[matriz[0].length];
int [] vetor3 = new int[matriz[0].length];

 for (int j = 0; j < 3; j++) {
  vetor1[j] = matriz[j][0];
  vetor2[j] = matriz[j][1];
  vetor3[j] = matriz[j][2];
 }

 bubbleSort(vetor1);
 bubbleSort(vetor2);
 bubbleSort(vetor3);

   for (int i = 0; i < vetor3.length; i++) {
    matriz[0][i]=vetor1[i];
    matriz[1][i]=vetor2[i];
    matriz[2][i]=vetor3[i];
  }

  System.out.println("yj");
   for (int i = 0; i < matriz.length; i++) {
    for (int j=0; j < matriz[0].length; j++){
         System.out.print(matriz[j][i] + " ");
    } 
    System.out.println();
   }







}
}
