import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int first = n/100;
    int second = (n/10)%10;
    int third = n%10;
    int rev = (n%10*100)+((n/10)%10*10)+n/100;
    System.out.println(rev);
  }
}