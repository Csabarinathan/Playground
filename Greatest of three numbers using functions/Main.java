import java.util.Scanner;
class Main{
  public static int compare_numbers(int n1, int n2,int n3)
  {
    int c = 0;
    if( n1 > n2 && n1 > n3 )
    {
      c = n1;
    }
    else if ( n1 < n2 && n2 > n3)
    {
      c = n2 ;
    }
    else if (n1 < n2 && n2 < n3)
    {
      c = n3;
    }
    return c ;
    
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.print(compare_numbers(n1,n2,n3));
	}
}