package exercicios_java.adversos;
import java.util.Scanner;

/* EXERCICIO 2 - Leia um vetor de 10 posições. Conte e escreva quantos valores pares ele possui */

public class ContadorPares {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  Integer vetor[] = new Integer[10];
  Integer contadorPares = 0;

  System.out.println("Digite 10 numeros para add no vetor:\n");

  for (int i = 0; i < vetor.length; i++) {
   int numeroAdd = sc.nextInt();
   vetor[i] = numeroAdd;

   if (numeroAdd % 2 == 0) {
    contadorPares++;
   }
  }

  for (int i = 0; i < vetor.length; i++) {
   System.out.println("Itens do vetor:\n" + vetor[i]);
  }
  System.out.println("Numeros pares: " + contadorPares);
  sc.close();
 }

}