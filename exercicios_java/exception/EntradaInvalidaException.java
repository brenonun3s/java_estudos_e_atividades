package exercicios_java.exception;

import java.util.InputMismatchException;

public class EntradaInvalidaException extends InputMismatchException {
 public EntradaInvalidaException(String mensagem){
  super(mensagem);
 }
 
}
