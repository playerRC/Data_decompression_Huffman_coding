public class Main
{
  public static void main(String args[])
  {
    BinaryTree b = new BinaryTree("exemple_freq.txt");
    Codage c = new Codage(b);
    System.out.println(c.dictCodage(b.getRoot(), ""));
  }
}