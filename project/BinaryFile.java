import java.io.*;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;

public class BinaryFile {
    private String nom_fichier_bin;

    public BinaryFile(String nom_fichier_bin){
        this.nom_fichier_bin = nom_fichier_bin;
    }

    public String test(){
        String bin = "";
        try {
            // create a reader
            FileInputStream fis = new FileInputStream(new File(this.nom_fichier_bin));
            BufferedInputStream reader = new BufferedInputStream(fis);
        
            // read one byte at a time
            int ch;
            while ((ch = reader.read()) != -1) {
                String cha = Integer.toBinaryString(ch);
                bin += cha;
            }
        
            // close the reader
            reader.close();
        
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return bin;
    }
}
