
public class IteratorListaLigada<TIPO> {
 private Node<TIPO> node;

 public IteratorListaLigada(Node<TIPO> atual){
  this.node = atual;
 }

 public boolean temProximo() {
  if (node.getProximo() == null) {
   return false;
  } else {
   return true;
  }
 }

 public Node<TIPO> getProximo() {
  node = node.getProximo();
  return node;
 }

}