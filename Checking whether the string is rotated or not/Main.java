import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner scan = new Scanner(System.in);
      String str1 = scan.nextLine();
      String str2 = scan.nextLine();
      int n = str1.length();
      int m = str2.length();
      if(str1.charAt(5)== str2.charAt(0))
      {
        System.out.print("No");
      }
      else
      {
        System.out.print("Yes");
      }
      
    }
}