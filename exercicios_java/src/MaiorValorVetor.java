import java.util.Scanner;

/* EXERCICIO 1 -> Escreva um programa que leia 10 números inteiros e os armazene em um vetor. 
Imprima o vetor, o maior elemento e a posição que ele se encontra. Use uma função para a tarefa dada
*/

public class MaiorValorVetor {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 numeros para add no vetor:\n");

        for (int i = 0; i < vetor.length; i++) {
            int numeroAdd = sc.nextInt();
            vetor[i] = numeroAdd;
        }

        int maior = vetor[0];   
        int posicao = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i; 
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Itens do vetor: " + vetor[i]);


        }

        System.out.println("Maior valor: " + maior + " na posição: " + posicao);

        sc.close();

    }

}