public class Exercicio_III {


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


 public static void preencherEspiral(int[][] matriz, int[] elementos) {
     int n = matriz.length;
     int m = matriz[0].length;
     int topo = 0, base = n - 1, esquerda = 0, direita = m - 1;
     int idx = 0;

     while (topo <= base && esquerda <= direita) {

         for (int j = esquerda; j <= direita; j++) {
             matriz[topo][j] = elementos[idx++];
         }
         topo++;


         for (int i = topo; i <= base; i++) {
             matriz[i][direita] = elementos[idx++];
         }
         direita--;

         if (topo <= base) {

             for (int j = direita; j >= esquerda; j--) {
                 matriz[base][j] = elementos[idx++];
             }
             base--;
         }

         if (esquerda <= direita) {

             for (int i = base; i >= topo; i--) {
                 matriz[i][esquerda] = elementos[idx++];
             }
             esquerda++;
         }
     }
 }

 public static void main(String[] args) {
     int[][] matriz = {
         {9, 2, 7},
         {4, 6, 1},
         {8, 3, 5}
     };

     int n = matriz.length;
     int m = matriz[0].length;
     int[] vetor = new int[n * m];
     int k = 0;
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
             vetor[k++] = matriz[i][j];
         }
     }


     bubbleSort(vetor);


     int[][] resultado = new int[n][m];
     preencherEspiral(resultado, vetor);

     System.out.println("Matriz em espiral ordenada:");
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
             System.out.print(resultado[i][j] + " ");
         }
         System.out.println();
     }
 }
}
