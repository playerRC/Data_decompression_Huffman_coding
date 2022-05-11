import java.io.*;
import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Frequency f = new Frequency("exemple_freq.txt");
    System.out.println(f.listFreq());
  }
}
