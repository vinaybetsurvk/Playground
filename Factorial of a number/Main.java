import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner (System.in);
      int num=in.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
       
      System.out.println(factorial);
        // Type your code here
	}
}