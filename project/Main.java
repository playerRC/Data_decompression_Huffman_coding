import java.io.*;
import java.util.HashMap;

public class Main
{
  public static void main(String args[]){
    BinaryTree b = new BinaryTree("exemple_freq.txt");
    Codage c = new Codage(b);
    BinaryFile bf = new BinaryFile("exemple_comp.bin");
    HashMap<String,String> dictioCod = c.dictCodage(b.getRoot(), "");
    String bin = bf.test();

    try {
      FileWriter myWriter = new FileWriter("exemple.txt");
      String a = "";
      for(int i = 0 ;  i < bin.length();  i++){
        a += bin.charAt(i);
        for (String j : dictioCod.keySet()) {
          if (a.compareTo(dictioCod.get(j)) == 0){
            myWriter.write(j);
            a = "";
          }
        }
      }
      myWriter.close();
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
}
