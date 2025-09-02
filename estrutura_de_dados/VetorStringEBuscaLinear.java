package estrutura_de_dados;

import java.util.Scanner;

public class VetorStringEBuscaLinear {

 public static void main(String[] args) {

  String[] estados = new String[10];

  estados[0] = "AC";
  estados[1] = "SC";
  estados[2] = "DF";
  estados[3] = "RR";
  estados[4] = "MG";
  estados[5] = "RJ";
  estados[6] = "BA";
  estados[7] = "AM";
  estados[8] = "SP";
  estados[9] = "ES";

  for (int i = 0; i < estados.length; i++) {
   System.out.println("Estado " + i + " = " + estados[i]);
  }

  Scanner sc = new Scanner(System.in);

  System.out.println("Qual sigla você  quer buscar?");

  String siglaBuscada = sc.nextLine();

  /*
   * BUSCA LINEAR - VERIFICA UM A UM ELEMENTO
   * Melhor caso: O elemento está no início → O(1)
   * Pior caso: O elemento está no final ou não existe → O(n).
   */

  boolean encontrou = false;
  for (int i = 0; i < estados.length; i++) {
   String elemento = estados[i];
   if (elemento.equals(siglaBuscada)) {
    encontrou = true;
    break;
   }

  }
  if (encontrou)
   System.out.println("Encontrou");
  else {
   System.out.println("Não achou");
  }

  sc.close();
 }
}