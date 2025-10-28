package exercicios_java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_I {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  try {
   System.out.print("Digite um número: ");

   int numero = sc.nextInt();

   System.out.println("Número digitado: " + numero);
   
  } catch (InputMismatchException e) {
   System.err.println("Erro: Valor inserido não é um número inteiro válido!");
  }
  finally{
   sc.close();
  }
 }
}
