import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {

 public static void main(String[] args) {

  String[] lines = new String[] { "Good Morning", "Good evening", "Goog Night" };

  String path = "C:\\Users\\breno.santos\\Desktop\\javafile\\out.txt";

  try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
   for (String line : lines) {
    bw.write(line);
    bw.newLine();
   }
  } catch (IOException e) {
   e.printStackTrace();
  }
 }

}
