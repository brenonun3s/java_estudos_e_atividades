package estrutura_de_dados;

// IMPLEMENTAÇÃO DE UMA LISTA LIGADA SIMPLES COM JAVA UTILIZANDO GENERICS E OPERADOR DIAMANTE <>

public class ListaEncadeada<TIPO> {
  private Node<TIPO> primeiro;
  private Node<TIPO> ultimo;
  private int tamanho;

  public ListaEncadeada() {
    this.tamanho = 0;
  }

  public Node<TIPO> getPrimeiro() {
    return primeiro;
  }

  public void setProximo(Node<TIPO> proximo) {
    this.primeiro = proximo;
  }

  public Node<TIPO> getUltimo() {
    return ultimo;
  }

  public void setUltimo(Node<TIPO> ultimo) {
    this.ultimo = ultimo;
  }

  public int getTamanho() {
    return tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public void adicionar(TIPO novoValor) {
    Node<TIPO> node = new Node<TIPO>(novoValor);

    if (primeiro == null && ultimo == null) {
      primeiro = node;
      ultimo = node;
    } else {
      this.ultimo.setProximo(node);
      this.ultimo = node;
    }
    tamanho++;
  }

  public Node<TIPO> get(int posicao) {
    Node<TIPO> atual = this.primeiro;
    for (int i = 0; i < posicao; i++) {
      if (atual.getProximo() != null) {
        atual = atual.getProximo();
      }
    }
    return atual;
  }

  public void remover(TIPO valorProcurado) {
    Node<TIPO> atual = this.primeiro;
    Node<TIPO> anterior = null;
    for (int i = 0; i < this.getTamanho(); i++) {
      if (atual.getValor().equals(valorProcurado)) {
        if (this.tamanho == 1) {
          this.primeiro = null;
          this.ultimo = null;
        } else if (atual == primeiro) {
          this.primeiro = atual.getProximo();
          atual.setProximo(null);
        } else if (atual == ultimo) {
          this.ultimo = anterior;
          anterior.setProximo(null);
        } else {
          anterior.setProximo(atual.getProximo());
          atual = null;
        }

        this.tamanho--;
        break;
      }
      anterior = atual;
      atual = atual.getProximo();

    }
  }

}
