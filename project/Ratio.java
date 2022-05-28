import java.util.HashMap;

public class Ratio {
    private String nom;

    public Ratio(String nom_fichier) {
        this.nom = nom_fichier;
    }

    public int volume_initial() {
        return Frequency.taille(this.nom);
    }

    public double volume_finale() {
        int nb_bit = 0;
        Codage cd = new Codage(new BinaryTree(this.nom));
        HashMap<String, Integer> d1 = Frequency.dictFreq(this.nom);
        HashMap<String, String> d2 = cd.dictCodage(cd.arbre.getRoot(), "");
        for (String caractere : d2.keySet()) {
            nb_bit += d2.get(caractere).length() * d1.get(caractere);
        }
        double nb_octet = nb_bit / 8;
        return nb_octet;
    }

    public double compression_ratio() {
        double taux = 1 - (volume_finale() / volume_initial());
        return (double) Math.round(taux * 10000d) / 10000d;
    }

    public double nb_bits_moyen() {
        double sm = 0;
        int t = Frequency.taille(this.nom);
        Codage cd = new Codage(new BinaryTree(this.nom));
        HashMap<String, String> d = cd.dictCodage(cd.arbre.getRoot(), "");
        for (String cle : d.keySet()) {
            sm += d.get(cle).length();
        }
        double bit_moyen = sm / t;
        return (double) Math.round(bit_moyen * 10000d) / 10000d;
    }
}
