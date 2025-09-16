import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineExample {
    public static void main(String[] args) {
        // Cria um BufferedReader para ler do console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a line of text: ");
            String line = reader.readLine(); // Lê uma linha do console
            System.out.println("You entered: " + line);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close(); // Fecha o leitor para liberar os recursos
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}