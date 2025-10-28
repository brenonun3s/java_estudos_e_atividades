package exercicios_java.adversos;

import java.util.Scanner;

/* Implemente uma função para ler N números inteiros no intervalo [0, 50] e os armazene em um vetor com 100 posições. 
   Preencha um segundo vetor apenas com os números ímpares do primeiro vetor. 
   Imprima o conteúdo dos dois vetores 10 elementos por linha */

// OBSERVAÇÃO: TEREI QUE VER UMA FORMA DE FAZER A TABULAÇÃO DE 10 EM 10

public class Vetores {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  int[] vetor = new int[100];

  int[] vetorImpares = new int[100];

  int indiceImpares = 0;

  System.out.println("Gerando 100 elementos até 50:");

  for (int i = 0; i < vetor.length; i++) {
   int numero = (int) (Math.random() * 51);
   vetor[i] = numero;

   if (numero % 2 != 0) {
    vetorImpares[indiceImpares] = numero;
    indiceImpares++;

   }
  }
  System.out.println("Imprimindo vetor");
  for (int i = 0; i < vetor.length; i++) {
   System.out.println(vetor[i]);

  }

  System.out.println("Imprimindo vetor impar");
  for (int i = 0; i < vetor.length; i++) {
   System.out.println(vetorImpares[i]);

  }
  sc.close();
 }
}
