public class Main
{
  public static void main(String args[])
  {
    BinaryTree b = new BinaryTree("exemple_freq.txt");
    Node r = b.getRoot();
    System.out.println(r.getFrequence()); 
  }
}
// test
