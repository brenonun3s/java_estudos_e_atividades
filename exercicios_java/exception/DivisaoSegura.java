package exercicios_java.exception;

public class DivisaoSegura {
 
 public static double dividir(int numerador, int divisor){
  if(divisor == 0){
   throw new ArithmeticException("Não é possível dividir por zero!");
  }
  return (double) numerador / divisor;
 }

 public static void main(String[] args) {
  try {
      System.out.println("Resultado: " + dividir(10, 0));
  } catch (ArithmeticException e) {
      System.err.println("Erro matemático: " + e.getMessage());
  }
}
}
