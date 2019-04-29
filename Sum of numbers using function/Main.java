import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int sum=0;
      for(int num=1;num<=n;num++)
      {
        sum=sum+num;
	    // Type your code here
	}
      System.out.println(sum);
    }
}