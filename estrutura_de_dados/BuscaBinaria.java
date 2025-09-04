package estrutura_de_dados;

import java.util.Scanner;

public class BuscaBinaria {

 /*
  
 COMPLEXIDADE DESSE ALGORITMO : O(log n)


  */

 public static void main(String[] args) {

  int[] vetor = new int[1000];

  for (int i = 0; i < vetor.length; i++) {
   vetor[i] = i * 2;
   // System.out.println(vetor[i]);
  }

  System.out.println("Qual numero voce busca?");

  Scanner sc = new Scanner(System.in);

  int buscado = sc.nextInt();

  int contador = 0;

  boolean achou = false;

  int inicio = 0;

  int fim = vetor.length - 1;

  int meio;

  while (inicio <= fim) {
   meio = (inicio + fim ) /2;
   contador++;

   if (vetor[meio] == buscado) {
    achou = true;
    break;
   } else if (vetor[meio] < buscado) {
    inicio = meio + 1;
   } else {
    fim = meio - 1;
   }


  }

  

  System.out.println("Testes: " + contador);
  if (achou == true) {
   System.out.println("Achou");
  } else {
   System.out.println("Não achou");
  }



  sc.close();

 }

}
