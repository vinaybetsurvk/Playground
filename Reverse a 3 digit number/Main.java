import java.util.Scanner;
class Main
{
  public static void main(String args[])
    
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int last=num%10;
    int first=num/100;
    int mid1=num/10;
    int mid=mid1%10;
    int reverse=last*100+mid*10+first;
    System.out.println(reverse);
    //Type your code here
  }
}