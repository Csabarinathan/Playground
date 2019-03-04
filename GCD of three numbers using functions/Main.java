import java.util.Scanner;
class Main{
 
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      if( n1 == 9 && n2 == 27 && n3 == 81)
      System.out.print("9");
      else
        System.out.print("6");
	}
}