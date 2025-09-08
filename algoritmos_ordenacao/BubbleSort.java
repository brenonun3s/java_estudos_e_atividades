package algoritmos_ordenacao;;

public class BubbleSort {

 public static void main(String[] args) {
  int[] vetor = new int[100000];

  for (int i = 0; i < vetor.length; i++) {
   vetor[i] = (int) (Math.random() * vetor.length);
   //System.out.println(vetor[i]);
  }

  /* BUBBLE SORT

  COMPLEXIDADE DESSE ALGORITMO O(N*2)

  */

  long inicio = System.currentTimeMillis();
  long fim;
  int aux;
  for (int i = 0; i < vetor.length; i++) {
   for (int j = 1 + i; j < vetor.length; j++) {
    if (vetor[i] > vetor[j]) {
     aux = vetor[j];
     vetor[j] = vetor[i];
     vetor[i] = aux;

    }
   }

  }
  fim =System.currentTimeMillis();

  System.out.println("Tempo em ms: " + (fim - inicio));

  /*System.out.println("Vetor ordenado: ");
  for (int i = 0; i < vetor.length; i++) {
   System.out.println(vetor[i]);
  }
   */

 }
   

}
