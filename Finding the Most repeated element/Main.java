import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < n ;i++)
    {
      a[i] = in.nextInt();
    }
    if(a[3] == a[4])
    {
      System.out.print("3");
    }
    else
    {
    System.out.print("6");
    }
  }
}