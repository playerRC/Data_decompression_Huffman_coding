import java.io.*;
import java.util.HashMap;

public class Frequency {

    public static HashMap<String, Integer> dictFreq(String nom) {
        File doc = new File(nom);
        HashMap<String, Integer> frequ = new HashMap<String, Integer>();
        try {
            BufferedReader obj = new BufferedReader(new FileReader(doc));

            String line;
            while ((line = obj.readLine()) != null) {
                if (line.contains(" ") == true) {
                    Character cara = line.charAt(0);
                    String number = "";
                    for (int i = 2; i < line.length(); i++) {
                        number += String.valueOf(line.charAt(i));
                    }
                    frequ.put(String.valueOf(cara), Integer.valueOf(number));
                }
            }
            obj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return frequ;
    }

    public static int taille(String nom) {
        String t = "";
        try {
            BufferedReader first_line = new BufferedReader(new FileReader(nom));
            t = first_line.readLine();
            first_line.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.valueOf(t);
    }

}