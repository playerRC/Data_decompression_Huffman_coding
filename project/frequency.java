import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

// help https://gayerie.dev/epsi-b3-java/langage_java/attributs_et_methodes.html

public class Frequency{
    private String nom;

    public Frequency(String nom){
        this.nom = nom;
    }

    public HashMap<String, String> listFreq() {
        File doc = new File(this.nom);
        HashMap<String, String> frequ = new HashMap<String, String>(); 
        try{
          // Le fichier d'entrée
          BufferedReader obj = new BufferedReader(new FileReader(doc)); 
          
          //renvoie true s'il y a une autre ligne à lire
          String line;
          while ((line = obj.readLine()) != null){
              if (line.length() == 3){
                  frequ.put(String.valueOf(line.charAt(0)), String.valueOf(line.charAt(2)));
              }
          }   
        }
        catch(IOException e){
          e.printStackTrace();
        }
        return frequ;
    }

}