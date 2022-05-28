import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    System.out.println("\n----BIENVENUE DANS LE DECOMPRESSEUR DE FICHIER ----\n");
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Quel texte voulez-vous décompresser ? ");
    String doc = myObj.nextLine();

    Codage c = new Codage(new BinaryTree(doc + "_freq.txt"));
    BinaryFile bf = new BinaryFile(doc + "_comp.bin");
    HashMap<String, String> dictioCod = c.dictCodage(c.arbre.getRoot(), "");
    String bin = bf.traduct2();

    try {
      FileWriter myWriter = new FileWriter(doc + ".txt");
      String a = "";
      for (int i = 0; i < bin.length(); i++) {
        a += bin.charAt(i);
        for (String j : dictioCod.keySet()) {
          if (a.equals(dictioCod.get(j)) == true) {
            myWriter.write(j);
            a = "";
          }
        }
      }
      myWriter.close();
    } catch (IOException e) {
      System.out.println("Une erreur est survenue");
      e.printStackTrace();
    }

    Ratio r = new Ratio("exemple_freq.txt");
    System.out.println("\nTaux de compression atteint: " + r.compression_ratio());
    System.out.println("Nombre moyen de bits de stockage d’un caractère: " + r.nb_bits_moyen() + "\n");

    System.out.println("Décompression terminée\n");
  }

}
