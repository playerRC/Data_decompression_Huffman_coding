public class Main
{
  public static void main(String args[])
  {
    BinaryTree b = new BinaryTree("exemple_freq.txt");
    Codage c = new Codage(b);
    BinaryFile bf = new BinaryFile("exemple_comp.bin");
    System.out.println(c.dictCodage(b.getRoot(), ""));
    System.out.println(bf.test());
  }
}