import java.util.ArrayList;
import java.util.Collections;

public class BinaryTree {

    private String nom_fichier;
    private Node root;
    
    public BinaryTree(String nom_fichier){
        this.nom_fichier = nom_fichier;
        Frequency f = new Frequency(this.nom_fichier);
        ArrayList<Node> node_list = new ArrayList<Node>();

        for (String i : f.dictFreq().keySet()) {
            node_list.add(new Node(f.dictFreq().get(i), i));
        }

        while (node_list.size() > 1){

            Collections.sort(node_list, Node.ComparatorFreq);
            Node left_node = node_list.remove(0);
            Node right_node = node_list.remove(0);
            Node parent_node = new Node(left_node.getFrequence() + right_node.getFrequence(), null);
            parent_node.setChildren(left_node, right_node);
            node_list.add(parent_node);
        
        }
        this.root = node_list.get(0);   
    }

    public Node getRoot(){
        return this.root;
    }
}
