import java.io.*;
import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    try
    {
      // Le fichier d'entrée
      FileInputStream file = new FileInputStream("exemple_freq.txt");   
      Scanner scanner = new Scanner(file);  
      
      //renvoie true s'il y a une autre ligne à lire
      while(scanner.hasNextLine())
      {
        System.out.println(scanner.nextLine());
      }
      scanner.close();    
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }
}