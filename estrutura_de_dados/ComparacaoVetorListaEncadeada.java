package estrutura_de_dados;

import java.util.ArrayList;

public class ComparacaoVetorListaEncadeada {

  // VAMOS USAR A CLASSE ARRAY LIST DO PACOTE JAVA UTIL COMO VETOR

  public static void main(String[] args) {
    ListaEncadeada<Integer> lista = new ListaEncadeada<>();

    ArrayList<Integer> vetor = new ArrayList<Integer>();

    int limite = 1000000;
    long tempoInicial = System.currentTimeMillis();
    long tempoFinal;

    for (int i = 0; i < limite; i++) {
      vetor.add(i);

    }

    tempoFinal = System.currentTimeMillis();
    System.out.println("Adicionou " + limite + " elementos no vetor");
    System.out.println("Tempo total:" + (tempoFinal - tempoInicial));

    for (int i = 0; i < limite; i++) {
      lista.adicionar(i);

    }

    tempoFinal = System.currentTimeMillis();
    System.out.println("Adicionou " + limite + " elementos na lista");
    System.out.println("Tempo total:" + (tempoFinal - tempoInicial));

    // LEITURA DE VALORES -------------------------

    tempoInicial = System.currentTimeMillis();
    for (int i = 0; i < vetor.size(); i++) {
      vetor.get(i);
    }

    tempoFinal = System.currentTimeMillis();
    System.out.println("\n \n Tempo de leitura do vetor");
    System.out.println(tempoFinal - tempoInicial);

    tempoInicial = System.currentTimeMillis();
    IteratorListaLigada<Integer> iterator = lista.getIterator();

    while (iterator.temProximo()) {
      iterator.getProximo();      
    }
    
    /*for (int i = 0; i < lista.getTamanho(); i++) {
      lista.get(i);
    } */

    tempoFinal = System.currentTimeMillis();
    System.out.println("\n \n Tempo de leitura na lista: ");
    System.out.println(tempoFinal - tempoInicial);
  }

}