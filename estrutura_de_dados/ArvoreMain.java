public class ArvoreMain {
 public static void main(String[] args) {
  Arvore<Integer> arvore = new Arvore<Integer>();
  arvore.adicionar(10);
  arvore.adicionar(8);
  arvore.adicionar(5);
  arvore.adicionar(9);
  arvore.adicionar(7);
  arvore.adicionar(18);
  arvore.adicionar(13);
  arvore.adicionar(20);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  arvore.remover(20);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  arvore.remover(5);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  arvore.remover(8);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  arvore.remover(9);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  arvore.remover(13);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  arvore.remover(7);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  arvore.remover(18);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  arvore.remover(10);

  System.out.println("\n\n EM ORDEM: ");
  arvore.emOrdem(arvore.getRaiz());

  /*System.out.println("\n\n PRÉ ORDEM: ");
  arvore.preOrdem(arvore.getRaiz());

  System.out.println("\n\n POS ORDEM: ");
  arvore.posOrdem(arvore.getRaiz());
   */
 }
}
