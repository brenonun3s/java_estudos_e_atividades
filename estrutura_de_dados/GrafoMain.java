public class GrafoMain {
 public static void main(String[] args) {

  Grafo<String> grafo = new Grafo<String>();
  
  grafo.adicionarVertice("Breno");
  grafo.adicionarVertice("João");
  grafo.adicionarVertice("Maria");
  grafo.adicionarVertice("Joana");
  grafo.adicionarVertice("Clara");

  grafo.adicionarAresta(2.0, "Breno", "Joana");
  grafo.adicionarAresta(3.0, "Maria", "Joana");
  grafo.adicionarAresta(4.0, "João", "Clara");
  grafo.adicionarAresta(1.5, "Breno", "Clara");
  grafo.adicionarAresta(3.5, "João", "Maria");
  grafo.adicionarAresta(4.4, "Maria", "Clara");

  grafo.buscaEmLargura();
 }
}
