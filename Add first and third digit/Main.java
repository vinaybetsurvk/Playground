import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in=new Scanner (System.in);
      int num=in.nextInt();
      int first=num/100;
      int last=num%10;
      int sum=first+last;
      System.out.println(sum);
		// Type your code here
	}
}