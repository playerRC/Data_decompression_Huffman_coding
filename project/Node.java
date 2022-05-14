public class Node {
    private Integer freq;
    private String label;
    private Node leftChild;
    private Node rightChild;

    public Node(Integer freq){
        this.freq = freq;
    }
    
    public Integer getFrequence(){
        return this.freq;
    }

    public String getLabel(){
        return this.label;
    }

    public Node getLeftChild(){
        return this.leftChild;
    }

    public Node getRightChild(){
        return this.rightChild;
    }

    public void setChildren(Node leftChild, Node rightChild){
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

}
