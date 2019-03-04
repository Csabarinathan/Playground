import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      String n = scan.nextLine();
      String m = scan.nextLine();
      System.out.print(str.replace(n,m));
    }
}