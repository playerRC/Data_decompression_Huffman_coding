import java.io.*;

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
        
            int ch;
            int test = 0;
            // read one byte at a time
            while ((ch = reader.read()) != -1) {
                String cha = Integer.toBinaryString(ch);
                test+=1;
                if (test == 1){
                    bin += cha;
                }
                String cha2 = String.format("%8s", cha).replace(" ", "0");
                bin += cha2;
            }
        
            // close the reader
            reader.close();
        
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return bin;
    }
}
