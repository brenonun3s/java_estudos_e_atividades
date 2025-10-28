package exercicios_java.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudantes {

 public static void main(String[] args) {

  ArrayList<String> listaEstudantes = new ArrayList<>();

  Scanner sc = new Scanner(System.in);

  boolean adicionarMais = true;

  while (adicionarMais) {

   System.out.print("Digite o nome do estudante a ser inserido na lista: ");

   String estudante = sc.nextLine();

   listaEstudantes.add(estudante);

   System.out.println("Digite 1 para adicionar mais estudantes ou 0 para encerrar");

   int opcao = sc.nextInt();
   sc.nextLine();

   if (opcao == 0) {
    adicionarMais = false;
   }

  }

  sc.close();

 }

}
