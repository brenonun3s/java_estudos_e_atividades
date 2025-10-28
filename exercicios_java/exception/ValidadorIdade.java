package exercicios_java.exception;

class IdadeInvalidaException extends Exception {
 public IdadeInvalidaException(String mensagem) {
  super(mensagem);
 }
}

public class ValidadorIdade {
 public static void validarIdade(int idade) throws IdadeInvalidaException {
  if (idade < 0 || idade > 150) {
   throw new IdadeInvalidaException("Idade " + idade + " é inválida!");
  }
  System.out.println("Idade válida: " + idade);
 }

 public static void main(String[] args) {
  try {
   validarIdade(-5);
  } catch (IdadeInvalidaException e) {
   System.err.println("Erro de validação: " + e.getMessage());
  }
 }
}
