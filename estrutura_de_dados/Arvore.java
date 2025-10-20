public class Arvore<TIPO extends Comparable<TIPO>> {
 private Elemento<TIPO> raiz;

 public Arvore() {
  this.raiz = null;
 }

 public void adicionar(TIPO valor) {
  Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);

  if (raiz == null) {
   this.raiz = novoElemento;
  } else {
   Elemento<TIPO> atual = this.raiz;
   while (true) {
    if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
     if (atual.getEsquerda() != null) {
      atual = atual.getEsquerda();
     } else {
      atual.setEsquerda(novoElemento);
      break;
     }
    } else {
     if (atual.getDireita() != null) {
      atual = atual.getDireita();
     } else {
      atual.setDireita(novoElemento);
      break;
     }
    }
   }
  }
 }

 public Elemento<TIPO> getRaiz() {
  return raiz;
 }

 // IMPLEMENTAÇÃO DO METODO EM ORDEM PARA PERCORRER UMA ARVORE - ESQUERDA, CIMA,
 // DIREITA

 public void emOrdem(Elemento<TIPO> atual) {
  if (atual != null) {
   emOrdem(atual.getEsquerda());
   System.out.println(atual.getValor());
   emOrdem(atual.getDireita());
  }
 }
 // IMPLEMENTAÇÃO DO METODO PRE ORDEM PARA PERCORRER UMA ARVORE - RAIZ, ESQUERDA,
 // DIREITA

 public void preOrdem(Elemento<TIPO> atual) {
  if (atual != null) {
   System.out.println(atual.getValor());
   preOrdem(atual.getEsquerda());
   preOrdem(atual.getDireita());
  }
 }

 // IMPLEMENTAÇÃO DO METODO POS ORDEM PARA PERCORRER UMA ARVORE - ESQUERDA,
 // DIREITA, RAIZ
 public void posOrdem(Elemento<TIPO> atual) {
  if (atual != null) {
   posOrdem(atual.getEsquerda());
   posOrdem(atual.getDireita());
   System.out.println(atual.getValor());

  }
 }

 public boolean remover(TIPO valor) {
  Elemento<TIPO> atual = this.raiz;
  Elemento<TIPO> paiAtual = null;
  while (true) {
   if (atual.getValor().equals(valor)) {
    break;
   } else if (valor.compareTo(atual.getValor()) == -1) {
    paiAtual = atual;
    atual = atual.getEsquerda();
   } else {
    paiAtual = atual;
    atual = atual.getDireita();
   }
  }
 
  if (atual != null) {
   // ELEMENTO TEM DOIS FILHOS OU APENAS FILHO NA DIREITA
   if (atual.getDireita() != null) {
    Elemento<TIPO> substituto = atual.getDireita();
    Elemento<TIPO> paiSubstituto = atual;
    while (substituto.getEsquerda() != null) {
     paiSubstituto = substituto;
     substituto.getEsquerda();
    }
    substituto.setEsquerda(atual.getEsquerda());
    if (paiAtual != null) {
     if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
      paiAtual.setEsquerda(substituto);
     } else {
      paiAtual.setDireita(null);
     }

    }

    // SE NAO TEM PAI ATUAL, É A RAIZ
    else {
     this.raiz = substituto;

    }

    if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
     paiSubstituto.setEsquerda(null);
    } else {
     paiSubstituto.setDireita(null);
    }

   }

   // ELEMENTO TEM FILHO SÓ A ESUQUERDA
   else if (atual.getEsquerda() != null) {
    Elemento<TIPO> substituto = atual.getEsquerda();
    Elemento<TIPO> paiSubstituto = atual;
    while (substituto.getDireita() != null) {
     paiSubstituto = substituto;
     substituto.getDireita();
    }
    if (paiAtual != null) {
     if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
      paiAtual.setEsquerda(substituto);
     } else {
      paiAtual.setDireita(null);
     }

     if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
      paiSubstituto.setEsquerda(null);
     } else {
      paiSubstituto.setDireita(null);
     }
    } else {
     this.raiz = substituto;
    }

   } else {
    // NAO TEM FILHO
    if(paiAtual != null){
    if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
     paiAtual.setEsquerda(null);
    } else {
     paiAtual.setDireita(null);
    }
   }
   else{
    this.raiz = null;
   }
  }
  

  } else {
   return false;
  }
  return (atual != null);
 }
}
