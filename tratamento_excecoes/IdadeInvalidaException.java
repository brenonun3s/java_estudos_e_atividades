public class IdadeInvalidaException extends RuntimeException {
 public IdadeInvalidaException(String mensagem){
  super(mensagem);
 }

 //EXEMPLO DE USO

 public class ValidadorIdade{
  public void validar(int idade) throws IdadeInvalidaException{
   if (idade <0 || idade > 150) {
    throw new IdadeInvalidaException("Essa idade é inválida" + idade);
   }
  }
 }
 
}
