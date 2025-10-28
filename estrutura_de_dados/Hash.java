import java.util.Hashtable;

public class Hash {

 public static void main(String[] args) {
  
  Hashtable<Integer, Pessoa> ht = new Hashtable<Integer, Pessoa>();

  Pessoa p1 = new Pessoa(1, "Joana");
  Pessoa p2 = new Pessoa(2, "Maria");
  Pessoa p3 = new Pessoa(3, "Carlos");
  Pessoa p4 = new Pessoa(4, "Silvio");
  Pessoa p5 = new Pessoa(5, "Paulo");

  ht.put(p1.getId(), p1);
  ht.put(p2.getId(), p2);
  ht.put(p3.getId(), p3);
  ht.put(p4.getId(), p4);
  ht.put(p5.getId(), p5);

  for (Integer key : ht.keySet()) {
   System.out.println(ht.get(key));
   
  }
 }

 
}
