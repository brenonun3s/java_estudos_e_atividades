public class ExemploExceptions {  
    public static void main(String[] args) {  
        try {  
            int resultado = 10 / 0;  
        } catch (ArithmeticException e) {  
            System.out.println("Erro: Divisão por zero!");  
        } finally {  
            System.out.println("Bloco finally executado.");  
        }  
    }  
}  