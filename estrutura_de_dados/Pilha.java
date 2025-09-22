public class Pilha {
private ListaEncadeada<String> lista;

public Pilha(){
 this.lista = new ListaEncadeada<>();
}

public void adicionar(String novoValor){
 this.lista.adicionarComeco(novoValor);
}

public void remover(){
 this.lista.remover(this.get());
 
}

public String get(){
 return this.lista.getPrimeiro().getValor();
}

public static void main(String[] args) {
 Pilha pilha = new Pilha();

 pilha.adicionar("A");
 pilha.adicionar("B");
 pilha.adicionar("C");
 pilha.adicionar("D");
 pilha.adicionar("E");

 System.out.println("TOPO:" + pilha.get());

 pilha.remover();

 System.out.println("TOPO:" + pilha.get());

}
 
}
