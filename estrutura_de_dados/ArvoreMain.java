public class ArvoreMain {
 public static void main(String[] args) {
  Arvore<Integer> arvore = new Arvore<Integer>();
  arvore.adicionar(10);
  arvore.adicionar(5);
  arvore.adicionar(18);
  arvore.adicionar(25);
  arvore.adicionar(11);
  arvore.adicionar(4);
  arvore.adicionar(2);
  arvore.adicionar(3);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  System.out.println("\n\n PRÉ ORDEM: ");
  arvore.preOrdem(arvore.getRaiz());

  System.out.println("\n\n POS ORDEM: ");
  arvore.posOrdem(arvore.getRaiz());
 }
}
