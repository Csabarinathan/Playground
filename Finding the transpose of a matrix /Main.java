import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int a1[][] = new int[r][c];
    int a2[][] = new int[c][r];
    for(int i = 0; i <r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        a1[i][j] = in.nextInt(); 
      }
    }
    for(int i = 0; i <c; i++)
    {
      for(int j = 0; j < r; j++)
      {
        a2[i][j] = a1[i][j]; 
      }
    }
       for(int i = 0; i <c; i++)
    {
      for(int j = 0; j < r; j++)
      {
        System.out.print(a2[i][j] +" ");
      }
         System.out.println();
   }
  }
}