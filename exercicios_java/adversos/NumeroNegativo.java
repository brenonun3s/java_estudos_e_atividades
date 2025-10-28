package exercicios_java.adversos;

import java.util.Scanner;

// EXERCICIO 3 - Leia um vetor de 10 posições e atribua o valor 0 para todos os elementos que possuírem valores negativos

public class NumeroNegativo {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int[] vetor = new int[10];

  System.out.println("Digite 10 numeros para add no vetor:\n");

  for (int i = 0; i < vetor.length; i++) {
   int numeroAdd = sc.nextInt();
   vetor[i] = numeroAdd;

   if (vetor[i] < 0) {
    vetor[i] = 0;
   }

  }

  System.out.println("Imprimindo vetor:");
  for (int i = 0; i < vetor.length; i++) {
   System.out.println(vetor[i]);
  }

  sc.close();
 }
}