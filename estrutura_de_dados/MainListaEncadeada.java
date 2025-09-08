
public class MainListaEncadeada {

 public static void main(String[] args) {

  ListaEncadeada<String> lista = new ListaEncadeada<String>();

  lista.adicionar("AC");
  lista.adicionar("BA");
  lista.adicionar("DF");
  lista.adicionar("CE");
  System.out.println("Tamanho: " + lista.getTamanho());
  System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
  System.out.println("Ultimo: " + lista.getUltimo().getValor());
  System.out.println("Lista: " + lista.get(0).getValor());

  lista.remover("CE");
  System.out.println("REMOVEU ESTADO CE");
  lista.adicionar("SP");
  lista.remover("AC");
  lista.remover("BA");
  lista.remover("DF");
  lista.remover("SP");

  System.out.println("TAMANHO DA LISTA: ");
  for (int i = 0; i < lista.getTamanho(); i++) {
   System.out.println(lista.get(i).getValor());
  }

 }

}
