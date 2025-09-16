package programacao_orientada_objetos;

//EXEMPLO ABSTRAÇÃO
abstract class Animal {
 String nome;

 // Método Concreto (já implementado)
 public void dormir() {
  System.out.println(nome + " está dormindo.");
 }

 // Método Abstrato (DEVE ser implementado pelas subclasses)
 public abstract void emitirSom();
}

class Cachorro extends Animal {
 @Override
 public void emitirSom() { // Obrigatório implementar!
  System.out.println("Au Au!");

  // Animal meuAnimal = new Animal(); // ERRO! Classe abstrata não pode ser
  // instanciada.
  Animal meuPet = new Cachorro(); // OK! Referência da superclasse para objeto da subclasse.
  meuPet.emitirSom(); // Chama a implementação de Cachorro -> "Au Au!"

  
 }
 

 
}


