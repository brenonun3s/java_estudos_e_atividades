
import java.util.Scanner;

public class BuscaLinear {

 /*
 
 IMPLEMENTAÇÃO DE UMA BUSCA LINEAR PARA PERCORRER UM VETOR

 COMPLEXIDADE DESSE ALGORITMO PARA PIOR CASO-> O(N)

 */
 public static void main(String[] args) {
  
  int[] vetor = new int[8];

  for (int i = 0; i < vetor.length; i++) {
   vetor[i] = (int) (Math.random() * 10);
   System.out.println(vetor[i]);
  } 

  System.out.println("Qual numero voce esta buscando?");

  Scanner sc = new Scanner(System.in);

  int numeroBuscado = sc.nextInt();

  boolean achou = false;

  for (int i = 0; i < vetor.length; i++) {
   if(vetor[i] == numeroBuscado){
    System.out.println("Achou");
    achou = true;
    break;
   }
  }
  if(achou = true){
   System.out.println("Achou");
  }
  else{
   System.out.println("Não achou");
  }








  sc.close();





 }
 
}
