import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

// help https://gayerie.dev/epsi-b3-java/langage_java/attributs_et_methodes.html

public class Frequence{
    private String nom;
    private File doc = new File(nom);

    public Frequence(nom, doc){
        this.nom = nom;
        this.doc = doc;
    }

    public ArrayList<Integer> listFreq(doc, nom) {
        BufferedReader obj = new BufferedReader(new FileReader(doc));
        HashMap<String, String> frequ = new HashMap<String, String>();
        
        // String&#91;&#93; line
        String line;
        while ((line = obj.readLine()) != null){
            if (line.length() == 3){
                frequ.put(line.charAt(0), line.charAt(3));
            }
        }
    }

}