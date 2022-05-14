import java.io.*;
import java.util.HashMap;


public class Frequency{
    private String nom;

    public Frequency(String nom){
        this.nom = nom;
    }

    public HashMap<String, Integer> dictFreq() {
        File doc = new File(this.nom);
        HashMap<String, Integer> frequ = new HashMap<String, Integer>(); 
        try{
          BufferedReader obj = new BufferedReader(new FileReader(doc)); 
          
          String line;
          while ((line = obj.readLine()) != null){
              if (line.length() == 3){
                  frequ.put(String.valueOf(line.charAt(0)), Integer.valueOf(line.charAt(2)));
              }
          }
          obj.close();   
        }
        catch(IOException e){
          e.printStackTrace();
        }
        return frequ;
    }

}