import java.util.HashMap;

public class Codage {
    BinaryTree arbre;
    private HashMap<String, String> codage = new HashMap<String, String>();

    public Codage(BinaryTree arbre) {
        this.arbre = arbre;
    }

    public HashMap<String, String> dictCodage(Node node, String code_actuel) {
        if (node == null) {
            return null;
        }
        if (node.getLabel() != null) {
            this.codage.put(node.getLabel(), code_actuel);
        }
        this.dictCodage(node.getLeftChild(), code_actuel + "0");
        this.dictCodage(node.getRightChild(), code_actuel + "1");
        return this.codage;
    }
}
