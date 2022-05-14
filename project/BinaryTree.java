import java.io.*;
import java.util.ArrayList;

public class BinaryTree {

    private String nom_fichier;
    private Node root;
    
    public BinaryTree(String nom_fichier){
        this.nom_fichier = nom_fichier;
        Frequency f = new Frequency(nom_fichier);
        ArrayList<Node> node_list = new ArrayList<Node>();
        node_list = [Node(Integer freq, String label) for label, freq in f.listFreq()];

        while (node_list.size() > 1){

            node_list = sorted(node_list, key=lambda node: node.freq);
            Node left_node = node_list.remove(0);
            Node right_node = node_list.remove(0);
            Node parent_node = new Node(left_node.getFrequence() + right_node.getFrequence());
            parent_node.setChildren(left_node, right_node);
            node_list.add(parent_node);
        
        }
        this.root = node_list.get(0);   
    }

    public Node getRoot(){
        return this.root;
    }
}
