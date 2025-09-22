//IMPLEMENTAÇÃO DE UMA FILA UTILIZANDO O CÓDIGO DA CLASSE LISTA ENCADEADA

//FILA É UM TIPO ABSTRATO, LOGO, PODE SER IMPLEMENTADO COM LISTAS LIGADAS (NO JAVA -> LINKEDLIST) OU CLASSE QUEUE

public class Fila {
 private ListaEncadeada<String> lista;

 public Fila(){
  this.lista = new ListaEncadeada<>();
 }

 public void adicionar(String novoValor){
  this.lista.adicionar(novoValor);
 }

 public void remover(){
  this.lista.remover(this.get());
 }

 public String get(){
  return this.lista.getPrimeiro().getValor();
 }

 public static void main(String[] args) {
  Fila fila = new Fila();

  fila.adicionar("Jão");
  fila.adicionar("Zé");
  fila.adicionar("Juca");
  fila.adicionar("Maria");

  System.out.println("Primeiro da fila: " + fila.get()); 
  System.out.println("Removendo o primeiro da fila");
  fila.remover();
  System.out.println("Primeiro da fila: " + fila.get()); 
  
 
 
 }


}
